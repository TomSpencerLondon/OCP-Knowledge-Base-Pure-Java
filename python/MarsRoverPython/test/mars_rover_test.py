import unittest

from parameterized import parameterized

from mars_rover import Rover

class MarsRoverTest(unittest.TestCase):
    def test_returns_current_coordinates(self):
        rover = Rover()
        result = rover.execute("M")
        self.assertEqual("0:0:N", result)

    @parameterized.expand([
        ('R', '0:0:E'),
        ('RR', '0:0:S'),
        ('RRR', '0:0:W')
    ])
    def test_rotate(self, command, expected):
        rover = Rover()
        result = rover.execute(command)
        self.assertEqual(expected, result)

if __name__ == '__main__':
    unittest.main()