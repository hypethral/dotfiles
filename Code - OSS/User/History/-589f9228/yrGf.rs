use std::{thread,time::Duration,sync::mpsc};

pub fn excerise_two(){
    let(senders,receivers) = mpsc::channel();
    let(senderm,receiverm) = mpsc::channel();
    thread::spawn(move ||{ //move ownership
        let mut s = 0; // values are unmatuable
    loop {
        senders.send(s);
        s+=1;
        if  s==60 {s=0;}
    }});
    thread::spawn(move ||{
        let mut m = 0;
        let mut i = 0;
        loop{
            senderm.send(m).unwrap();
            i +=1;
            if i==60 {
                i=0;
                
                m+=1;
            }
        }});
    loop {
        let revalues = receivers.recv().unwrap();
        let revaluem = receiverm.recv().unwrap();
        println!("Mins : {} , Secs : {}", revaluem, revalues);
    }
}