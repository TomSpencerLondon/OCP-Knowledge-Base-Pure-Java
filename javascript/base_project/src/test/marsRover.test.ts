import {MarsRover} from "../main/marsRover";
import {Grid} from "../main/Grid";
import each from "jest-each";

describe('MarsRover', () => {
    const grid: Grid = new Grid();
    it("empty command should return 0:0:N", () => {
        let rover: MarsRover = new MarsRover(grid);

        expect(rover.execute("")).toBe("0:0:N");
    });

    each(
      [
        ["R", "0:0:E"]
      ]
    ).it(" when %s returns %s", (input: string, result: string) => {
        let rover: MarsRover = new MarsRover(grid);

        expect(rover.execute(input)).toBe(result);
    });
})
