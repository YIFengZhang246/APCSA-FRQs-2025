class SumOrSameGamejava{
    private int[][] puzzle;

    public SumOrSameGamejava(int numRows, int numCols){
        int[][] puzzle = new int[numRows][int numCols];
        int rand = (int) (Math.random()*9)+1;
        for(int row = 0; row < puzzle.length; row++){
            for(int col = 0; col < puzzle[row].length){
                puzzle[row][col] = rand;
            }
        }
    }
