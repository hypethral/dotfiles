use std::{thread,time::Duration};

fn excerise_one(){
    thread::spawn(||{
        let s = 0;
    loop {
        println!("{}",s);
        s+=1;
    }});
}