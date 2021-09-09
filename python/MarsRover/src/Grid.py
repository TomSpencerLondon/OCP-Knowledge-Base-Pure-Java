from src.Direction import Direction
from src.Position import Position


class Grid:
    def __init__(self, obstacles = []):
        self._obstacles = obstacles

    def move(self, direction, position):
        switcher = {
            Direction.NORTH: Position(position.x, position.y + 1),
            Direction.EAST: Position(position.x + 1, position.y),
            Direction.SOUTH: Position(position.x, position.y - 1),
            Direction.WEST: Position(position.x - 1, position.y)
        }

        for o in self._obstacles:
            if (o == switcher.get(direction, position)):
                raise Exception(f"obstacle at x: {position.x}, y: {position.y}")

        return switcher.get(direction, position)