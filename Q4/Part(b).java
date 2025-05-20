 public boolean clearPair(int row, int col){
        int puz = puzzle[row][col];
        for(int rows = 0; rows < puzzle.length; row++){
            for(int cols = 1; cols < puzzle[rows].length-1;cols++){
                if(puzzle[rows][cols-1] + puz == 10 || puzzle[row][col+1] + puz == 10 ){
                    puzzle[row][col] = 0;
                    puzzle[rows][cols] = 0;
                    return true;
                }
            }
        }
        return false;
    }
}
