import {Grid} from "./Grid";

export class MarsRover {
    private grid: Grid;
    constructor(grid: Grid){
        this.grid = grid;
    }

    public execute(command: string) {
        return "0:0:N";
    }
}
