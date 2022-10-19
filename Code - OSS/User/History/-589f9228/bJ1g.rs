use std::{thread,time::Duration,sync::mpsc};

pub fn excerise_two(){
    let(senderSec,receiverSec) = mpsc::channel();
    let(senderMin,receiverMin) = mpsc::channel();
    thread::spawn(move ||{ //move ownership
        let mut s = 0; // values are unmatuable
    loop {
        senderSec.send(s);
        s+=1;
        if  s==60 {s=0;}
    }});
    thread::spawn(move ||{
        let mut m = 0;
        let mut i = 0;
        loop{
            senderMin.send(m);
            i +=1;
            if i==60 {
                i=0;
                m+=1;
            }
        }});
    loop {
        let revalueS = receiverSec.recv().unwrap();
        let revalueM = receiverMin.recv().unwrap();
    }

}