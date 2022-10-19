use std::{thread,time::Duration};

pub fn excerise_one(){
    thread::spawn(||{
        let mut s = 0; // values are unmatuable
    loop {
        println!("Secs {}",s);
        s+=1;
        if  s==60 {s=0;}
    }});
    let mut m = 0;
    let i = 0;
    loop{
        println!("Mins {}",m);
        i +=1;
        if i==60 {
            i=0;
            m+=1;
        }
        thread::sleep(Duration::from_secs(1));
    }
    
}