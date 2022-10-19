// mod ex1;
use std::thread;
use std::time::Duration;

pub fn main() {
    thread::spawn(||{
        loop {
            println!("heyyy from the spawned thread!!");
            // thread::sleep(Duration::from_secs(1));  
        }});
    println!("Hello from the main thread!");
}
