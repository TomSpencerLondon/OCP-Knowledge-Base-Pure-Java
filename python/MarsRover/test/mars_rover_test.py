import unittest

from parameterized import parameterized
from src.Grid import Grid
from src.Position import Position
from src.Rover import Rover


class MarsRoverTest(unittest.TestCase):
    def setUp(self):
        self.grid = Grid()
        self.rover = Rover(self.grid)

    def test_return_0_0_for_empty_command(self):
        result = self.rover.execute("")
        self.assertEqual("0:0:N", result)

    @parameterized.expand([
        ('R', 'E'),
        ('RR', 'S'),
        ('RRR', 'W'),
        ('RRRR', 'N'),
        ('RRRRR', 'E')
    ])
    def test_turn_right(self, input, direction):
        result = self.rover.execute(input)
        self.assertEqual(f"0:0:{direction}", result)

    @parameterized.expand([
        ('L', 'W'),
        ('LL', 'S'),
        ('LLL', 'E'),
        ('LLLL', 'N'),
        ('LLLLL', 'W')
    ])
    def test_turn_left(self, input, direction):
        result = self.rover.execute(input)
        self.assertEqual(f"0:0:{direction}", result)

    @parameterized.expand([
        ('M', 0, 1, 'N'),
        ('MMMM', 0, 4, 'N'),
        ('MMMMMMMMMM', 0, 0, 'N'),
        ('RMM', 2, 0, 'E'),
        ('RMMMMMMMMM', 9, 0, 'E'),
        ('RMMMMMMMMMM', 0, 0, 'E')
    ])
    def test_move(self, input, x, y, direction):
        result = self.rover.execute(input)
        self.assertEqual(f"{x}:{y}:{direction}", result)

    def test_obstacle(self):
        command = 'MMMM'
        self.grid = Grid([Position(0, 3)])
        self.rover = Rover(self.grid)
        result = self.rover.execute(command)
        self.assertEqual("O:0:2:N", result)

if __name__ == '__main__':
    unittest.main()
