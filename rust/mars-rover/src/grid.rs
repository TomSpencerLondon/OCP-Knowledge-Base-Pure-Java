use crate::position::Position;
use crate::direction::Direction;

pub struct Grid {
    obstacles: Vec<Position>,
}

impl Grid {
    pub fn new(obstacles: Vec<Position>) -> Grid {
        Grid {
            obstacles
        }
    }

    pub fn move_forward(&mut self, position: Position, direction: &Direction) -> Option<Position> {
        if self.obstacles.contains(&position) {
            return None;
        }
        match direction {
            Direction::N => { Some(Position::new(position.x, position.y + 1)) }
            Direction::E => { Some(Position::new(position.x + 1, position.y)) }
            Direction::S => { Some(Position::new(position.x, position.y - 1)) }
            Direction::W => { Some(Position::new(position.x - 1, position.y)) }
        }
    }
}