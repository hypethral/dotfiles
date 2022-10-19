use std::{thread,time::Duration};

fn excerise_one(){
    thread::spawn(||{
        let mut s = 0; // values are unmatuable
    loop {
        println!("{}",s);
        s+=1;
        if  s==60 {
            s=0
        }
    }});
}