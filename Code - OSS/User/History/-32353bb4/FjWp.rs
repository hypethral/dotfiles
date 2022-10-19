fn main() {
    println!("Hello, world!");
    let x; // declare "x"
    x = 42; // assign 42 to "x"

    let y: i32; // `i32` is a signed 32-bit integer
    y = 42;
    // there's i8, i16, i32, i64, i128
    //    also u8, u16, u32, u64, u128 for unsigned

    let x: i32 = 42;
    
    let x;
    foobar(x); // error: borrow of possibly-uninitialized variable: `x`
    x = 42;



}
