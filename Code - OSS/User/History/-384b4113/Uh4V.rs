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

use std::thread;
use std::time::Duration;

fn main() {
    thread::spawn(|| {
        for i in 1..10 {
            
            
        }
    });

    for i in 1..5 {
        println!("hi number {} from the main thread!", i);
        thread::sleep(Duration::from_millis(1));
    }
}
