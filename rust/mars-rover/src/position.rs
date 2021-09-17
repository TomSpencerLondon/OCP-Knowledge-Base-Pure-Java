#[derive(Eq, PartialEq)]
pub struct Position {
    pub x: i32,
    pub y: i32
}

impl Position {
    pub fn new(x: i32, y: i32) -> Position {
        Position {
            x: if x < 0 { 9 } else { x % 10 },
            y: if y < 0 { 9 } else { y % 10 }
        }
    }
}
