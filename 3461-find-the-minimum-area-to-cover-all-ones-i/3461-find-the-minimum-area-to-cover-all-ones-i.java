class Solution {
    public int minimumArea(int[][] grid) {
        int maxrow = 0;
        int minrow = grid.length-1;
        int maxcol = 0;
        int mincol = grid[0].length-1;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 1){
                    if(i < minrow)minrow = i;
                    if(i > maxrow)maxrow = i;
                    if(j < mincol)mincol = j;
                    if(j > maxcol)maxcol = j;
                }
            }
        }
        return (maxrow - minrow+1)*(maxcol - mincol+1);
    }
}