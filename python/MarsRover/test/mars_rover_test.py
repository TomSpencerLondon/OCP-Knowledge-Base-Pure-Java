import unittest

from parameterized import parameterized

from src.Grid import Grid
from src.Rover import Rover


class MarsRoverTest(unittest.TestCase):
    def setUp(self):
        self.grid = Grid()
        self.rover = Rover(self.grid)

    def test_return_0_0_for_empty_command(self):
        result = self.rover.execute("")
        self.assertEqual("0:0:N", result)

    @parameterized.expand([
        ('R', 'E')
    ])
    def test_return_0_0_E_for_R(self, input, direction):
        result = self.rover.execute("R")
        self.assertEqual(f"0:0:{direction}", result)

if __name__ == '__main__':
    unittest.main()
