extern crate scheduled_thread_pool;
use std::time::Duration;
use crossbeam_channel::unbounded;
use std::thread;
use scheduled_thread_pool::ScheduledThreadPool;

struct Bun {
    no:i32
}
struct Customer {
    no:i32
}
fn main(){
    let mut no = 1;
    let(rack_s,rack_r) = unbounded();
    let baker:ScheduledThreadPool = ScheduledThreadPool::new(3);
    baker.execute_with_fixed_delay(Duration::from_secs(0), Duration::from_secs(5),move ||{
        for _i in 0 .. 12{
            let b = Bun{no};
            rack_s.send(b).unwrap();
            no+=1;
            thread::sleep(Duration::from_millis(500));
        }
        println!("Baker: added 12 buns to the rack");
       

    });
    let worker:ScheduledThreadPool = ScheduledThreadPool::new(2);
    worker.execute_with_fixed_delay(Duration::from_secs(0), Duration::from_secs(1),move ||{
        for _i in 0 .. 4{
            let bun = rack_r.recv().unwrap();
            println!("Worker: received bun {}",bun.no);

            thread::sleep(Duration::from_millis(500));
        }
        println!("Baker: added 12 buns to the rack");
    });
    // customer - required a mutiple receiver channel
    // generate customers
    baker.execute_with_fixed_delay(Duration::from_secs(0), Duration::from_secs(1),move ||{
        for _i in 0 .. 2{
            let c = Customer{no};
            rack_s.send(c).unwrap();
            no+=1;
            thread::sleep(Duration::from_millis(500));
        }
    });
}


// Threads simple exercise
// extern crate threadpool;
// use std::time::Duration;
// use std::sync::mpsc;
// use std::thread;
// use threadpool::ThreadPool;
// fn main() {
//     thread::spawn(||{
//         println!("Hello, world!");
//     });
//     let pool:ThreadPool = ThreadPool::new(2);
//     pool.execute(||{
//         print!("hey from thread pool")
//     });
//     thread::sleep(Duration::from_millis(10));
// }

// // Scduled Thread Pools
// extern crate scheduled_thread_pool;
// use std::time::Duration;
// use std::sync::mpsc;
// use std::thread;
// use scheduled_thread_pool::ScheduledThreadPool;
// fn main(){
//     thread::spawn(||{
//         println!("Hello, world!");
//     });
//     let pool:ScheduledThreadPool = ScheduledThreadPool::new(2);
//     pool.execute_with_fixed_delay(Duration::from_secs(0), Duration::from_secs(2),move ||{
//         println!("timed exute");
//     });
//     thread::sleep(Duration::from_millis(10));
// }