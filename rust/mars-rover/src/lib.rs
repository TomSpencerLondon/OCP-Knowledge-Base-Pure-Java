use crate::direction::Direction;
use crate::grid::{Grid};

mod direction;
mod grid;
mod position;

pub struct Rover {
    grid: Grid
}

impl Rover {
    pub fn new() -> Rover {
        Rover { grid: Grid {} }
    }

    pub fn execute(&mut self, input: &str) -> String {
        let commands = input.split("");
        let mut direction: Direction = Direction::N;
        for c in commands {
            if c == "R" {
                direction = self.turn_right(direction);
            } else if c == "L" {
                direction = self.turn_left(direction);
            }
        }
        String::from(format!("0:0:{:?}", direction))
    }


    fn turn_left(&mut self, direction: Direction) -> Direction {
        match direction {
            Direction::N => { Direction::W }
            Direction::E => { Direction::N }
            Direction::S => { Direction::E }
            Direction::W => { Direction::S }
        }
    }

    fn turn_right(&mut self, direction: Direction) -> Direction {
        match direction {
            Direction::N => { Direction::E }
            Direction::E => { Direction::S }
            Direction::S => { Direction::W }
            Direction::W => { Direction::N }
        }
    }
}


#[cfg(test)]
mod tests {
    use super::*;
    use test_case::test_case;

    #[test]
    fn empty_command() {
        let mut rover: Rover = Rover::new();
        assert_eq!(rover.execute(""), String::from("0:0:N"));
    }

    #[test_case("R",  "0:0:E")]
    #[test_case("RR",  "0:0:S")]
    #[test_case("RRR",  "0:0:W")]
    #[test_case("RRRR",  "0:0:N")]
    #[test_case("RRRRR",  "0:0:E")]
    fn turn_right(input: &str, position: &str) {
        let mut rover: Rover = Rover::new();
        assert_eq!(rover.execute(input), String::from(position));
    }

    #[test_case("L",  "0:0:W")]
    #[test_case("LL",  "0:0:S")]
    #[test_case("LLL",  "0:0:E")]
    #[test_case("LLLL",  "0:0:N")]
    #[test_case("LLLLL",  "0:0:W")]
    fn turn_left(input: &str, position: &str) {
        let mut rover: Rover = Rover::new();
        assert_eq!(rover.execute(input), String::from(position));
    }
}
