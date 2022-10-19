fn main() {
    println!("Hello, world!");
    let x; // declare "x"
    x = 42; // assign 42 to "x"

    let y: i32; // `i32` is a signed 32-bit integer
    y = 42;
    // there's i8, i16, i32, i64, i128
    //    also u8, u16, u32, u64, u128 for unsigned

    let x: i32 = 42;
    
    //error x not defined
    // let x;
    // foobar(x); // error: borrow of possibly-uninitialized variable: `x`
    // x = 42;

    let x;
    x = 42;
    // foobar(x); // the type of `x` will be inferred from here

    // _ 'underscore' is a throwaway char
    // this does *nothing* because 42 is a constant
    let _ = 42;
    // this calls `get_thing` but throws away its result
    // let _ = get_thing();


    // we may use `_x` eventually, but our code is a work-in-progress
    // and we just wanted to get rid of a compiler warning for now.
    let _x = 42;
}
