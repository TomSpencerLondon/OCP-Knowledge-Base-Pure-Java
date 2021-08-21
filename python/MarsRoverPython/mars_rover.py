from dataclasses import dataclass, replace

@dataclass(frozen=True)
class Rover(object):
    def execute(self, command):
        position = '0:0'
        direction = 'N'

        if (command == 'R'):
            direction = 'E'

        if (command == 'RR'):
            direction = 'S'

        if (command == 'RRR'):
            direction = 'W'

        return f"{position}:{direction}"