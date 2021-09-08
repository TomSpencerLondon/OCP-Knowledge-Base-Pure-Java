import grid as grid

from src import Grid


class Rover:
    def __init__(self, grid):
        self.grid = grid

    def execute(self, input):
        if (input == "R"):
            return "0:0:E"
        return "0:0:N"