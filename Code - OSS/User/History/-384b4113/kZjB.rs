mod ex1;
mod ex2;
use ex1::excerise_one;

pub fn main() {
    excerise_one();
    // thread::spawn(|| {
    //     loop {
    //         println!("this is a spawn!!");
    //         thread::sleep(Duration::from_millis(1));  
    //     }
    // });
    // println!("Hello from the main thread!");
}