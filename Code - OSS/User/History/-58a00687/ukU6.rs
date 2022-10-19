use std::{thread,time::Duration,sync::mpsc};

// This block is for blocking make a channel like a traffic signal
pub fn exer2() {
    let(sender,receiver) = mpsc::channel();
    thread::spawn(move ||{ // move ownership
        let value = 10;
        thread::sleep(Duration::from_secs(1));
        sender.send(value);
    });
    println!("main is waiting for a value");
    let revalue = receiver.recv().unwrap();
    println!("main thread value: {}", revalue);
}