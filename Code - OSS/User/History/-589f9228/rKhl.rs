use std::{thread,time::Duration,sync::mpsc};

pub fn excerise_two(){
    let(senderSec,receiverSec) = mpsc::channel();
    thread::spawn(move ||{ //move ownership
        let mut s = 0; // values are unmatuable
    loop {
        sender.send(s);
        s+=1;
        if  s==60 {s=0;}
    }});
    thread::spawn(move ||{
        let mut m = 0;
        let mut i = 0;
        loop{
            sender.send(m);
            i +=1;
            if i==60 {
                i=0;
                m+=1;
            }
        }});
    loop {
        let revalue = receiver.recv().unwrap();
    }

}