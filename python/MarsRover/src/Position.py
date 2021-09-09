
class Position(object):
    def __init__(self, x, y):
        self._x = 0 if x < 0 else x % 10
        self._y = 0 if y < 0 else y % 10

    @property
    def x(self):
        return self._x

    @property
    def y(self):
        return self._y