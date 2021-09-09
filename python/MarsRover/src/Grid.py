from src.Direction import Direction
from src.Position import Position


class Grid:
    def __init__(self):
        pass

    def move(self, direction, position):
        switcher = {
            Direction.NORTH: Position(position.x, position.y + 1),
            Direction.EAST: Position(position.x - 1, position.y),
            Direction.SOUTH: Position(position.x, position.y - 1),
            Direction.WEST: Position(position.x + 1, position.y - 1)
        }

        return switcher.get(direction, position)