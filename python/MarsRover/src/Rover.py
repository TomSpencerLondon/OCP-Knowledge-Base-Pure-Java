from src.Direction import Direction
from src.Grid import Grid

class Rover:
    def __init__(self, grid):
        self.grid = grid

    def execute(self, input):
        direction: Direction = Direction.NORTH
        if (input == "R"):
            direction = Direction.EAST

        return f"0:0:{direction.value}"