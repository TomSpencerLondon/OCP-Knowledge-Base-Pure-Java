from src.Direction import Direction
from src.Grid import Grid

class Rover:
    def __init__(self, grid):
        self.grid = grid

    def execute(self, input):
        direction: Direction = Direction.NORTH
        commands = [ch for ch in input]

        for c in commands:
            if (c == 'R'):
                direction = self.turnRight(direction)
            elif(c == 'L'):
                direction = self.turnLeft(direction)


        return f"0:0:{direction.value}"

    def turnRight(self, direction):
        switcher = {
            Direction.NORTH: Direction.EAST,
            Direction.EAST: Direction.SOUTH,
            Direction.SOUTH: Direction.WEST,
            Direction.WEST: Direction.NORTH
        }
        return switcher.get(direction, Direction.NORTH)

    def turnLeft(self, direction):
        switcher = {
            Direction.NORTH: Direction.WEST,
            Direction.WEST: Direction.SOUTH,
            Direction.SOUTH: Direction.EAST,
            Direction.EAST: Direction.NORTH
        }
        return switcher.get(direction, Direction.NORTH)
