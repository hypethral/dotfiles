// mod ex1;
use std::thread;
use std::time::Duration;

pub fn main() {
    thread::spawn(|| {
        loop {
            println!("hi number {} from the spawned thread!", i);
            thread::sleep(Duration::from_millis(1));  
        }
    });
    println!("Hello from the main thread!");
}