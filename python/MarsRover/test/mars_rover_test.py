import unittest

from src.Grid import Grid
from src.Rover import Rover


class MarsRoverTest(unittest.TestCase):
    def setUp(self):
        self.grid = Grid()
        self.rover = Rover(self.grid)

    def test_return_0_0_for_empty_command(self):
        result = self.rover.execute("")
        self.assertEqual("0:0:N", result)

    def test_return_0_0_E_for_R(self):
        result = self.rover.execute("R")
        self.assertEqual("0:0:E", result)

if __name__ == '__main__':
    unittest.main()
