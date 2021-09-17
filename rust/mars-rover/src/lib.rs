use crate::direction::Direction;
use crate::grid::{Grid};
use crate::position::Position;

mod direction;
mod grid;
mod position;

pub struct Rover {
    grid: Grid,
    position: Position,
    direction: Direction
}

impl Rover {
    pub fn new(grid: Grid) -> Rover {
        Rover { grid, position: Position::new(0, 0), direction: Direction::N }
    }

    pub fn execute(&mut self, input: &str) -> String {
        let commands = input.split("");
        let mut obstacle= None;
        for c in commands {
            if c == "R" {
                self.direction = self.turn_right();
            } else if c == "L" {
                self.direction = self.turn_left();
            } else if c == "M" {
                let new_position = self.grid.move_forward(Position::new(self.position.x, self.position.y), &self.direction);
                if new_position.is_none() {
                    obstacle = Some("O:");
                    break;
                }else {
                    self.position = new_position.unwrap();
                }
            }
        }

        if (obstacle.is_none()) {
            return String::from(format!("{:?}:{:?}:{:?}", self.position.x, self.position.y, self.direction));
        } else {
            return obstacle.unwrap().to_string() + &String::from(format!("{:?}:{:?}:{:?}", self.position.x, self.position.y, self.direction));
        }
    }

    fn turn_left(&mut self) -> Direction {
        match self.direction {
            Direction::N => { Direction::W }
            Direction::E => { Direction::N }
            Direction::S => { Direction::E }
            Direction::W => { Direction::S }
        }
    }

    fn turn_right(&mut self) -> Direction {
        match self.direction {
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
        let mut grid: Grid = Grid::new(Vec::new());
        let mut rover: Rover = Rover::new(grid);
        assert_eq!(rover.execute(""), String::from("0:0:N"));
    }

    #[test_case("R",  "0:0:E")]
    #[test_case("RR",  "0:0:S")]
    #[test_case("RRR",  "0:0:W")]
    #[test_case("RRRR",  "0:0:N")]
    #[test_case("RRRRR",  "0:0:E")]
    fn turn_right(input: &str, position: &str) {
        let mut grid: Grid = Grid::new(Vec::new());
        let mut rover: Rover = Rover::new(grid);
        assert_eq!(rover.execute(input), String::from(position));
    }

    #[test_case("L",  "0:0:W")]
    #[test_case("LL",  "0:0:S")]
    #[test_case("LLL",  "0:0:E")]
    #[test_case("LLLL",  "0:0:N")]
    #[test_case("LLLLL",  "0:0:W")]
    fn turn_left(input: &str, position: &str) {
        let mut grid: Grid = Grid::new(Vec::new());
        let mut rover: Rover = Rover::new(grid);
        assert_eq!(rover.execute(input), String::from(position));
    }

    #[test_case("M", "0:1:N")]
    #[test_case("MMMMM", "0:5:N")]
    #[test_case("MMMMMMMMMMM", "0:1:N")]
    #[test_case("RMMMMM", "5:0:E")]
    #[test_case("LMMMMMM", "4:0:W")]
    fn move_forward(input: &str, position: &str) {
        let mut grid: Grid = Grid::new(Vec::new());
        let mut rover: Rover = Rover::new(grid);
        assert_eq!(rover.execute(input), String::from(position));
    }

    #[test_case("MMM", "O:0:2:N")]
    fn move_with_obstacle(input: &str, position: &str) {
        let obstacles = vec![Position::new(0, 2)];
        let mut grid: Grid = Grid::new(obstacles);
        let mut rover: Rover = Rover::new(grid);
        assert_eq!(rover.execute(input), String::from(position));
    }

}
