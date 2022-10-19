extern crate scheduled_thread_pool;
use std::time::Duration;
use std::sync::mpsc; 
use std::thread;
use scheduled_thread_pool::ScheduledThreadPool;

struct bun {
    no:i32
}

fn main(){
    let(rack_s,rack_r) = mpsc::channel();
    let baker:ScheduledThreadPool = ScheduledThreadPool::new(2);
    baker.execute_with_fixed_delay(Duration::from_secs(0), Duration::from_secs(5),move ||{
        println!("timed exute");
    });
    let worker:ScheduledThreadPool = ScheduledThreadPool::new(2);
    worker.execute_with_fixed_delay(Duration::from_secs(0), Duration::from_secs(1),move ||{
        println!("timed exute");
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