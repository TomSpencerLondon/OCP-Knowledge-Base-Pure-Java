use crate::position::Position;
use crate::direction::Direction;

pub struct Grid {
}

impl Grid {
    pub fn move_forward(&mut self, position: Position, direction: &Direction) -> Position {
        match direction {
            Direction::N => { Position::new(position.x, position.y + 1) }
            Direction::E => { Position::new(position.x + 1, position.y) }
            Direction::S => { Position::new(position.x, position.y - 1) }
            Direction::W => { Position::new(position.x - 1, position.y) }
        }
    }
}