use std::{thread,time::Duration,sync::mpsc};

pub fn main() {
    let(sender,receiver) = mpsc::channel();
    thread::spawn(move ||{ // move ownership
        let value = 10;
        thread::sleep(Duration::from_secs(1));
        sender.send(value);
    });
    println!("main is waiting for a value");
    let revalue = receiver.recv().unwrap();
}