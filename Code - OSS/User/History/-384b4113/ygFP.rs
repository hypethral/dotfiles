mod ex1;
mod ex2;
// use ex1::excerise_one;
use ex2::main;

pub fn main() {
    main();
    // thread::spawn(|| {
    //     loop {
    //         println!("this is a spawn!!");
    //         thread::sleep(Duration::from_millis(1));  
    //     }
    // });
    // println!("Hello from the main thread!");
}