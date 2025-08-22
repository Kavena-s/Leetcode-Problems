class Solution {
    public int minimumArea(int[][] grid) {
        int maxrow = Integer.MIN_VALUE;
        int minrow = Integer.MAX_VALUE;
        int maxcol = Integer.MIN_VALUE;
        int mincol = Integer.MAX_VALUE;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 1){
                    minrow = Math.min(minrow,i);
                    maxrow = Math.max(maxrow,i);
                    mincol = Math.min(mincol,j);
                    maxcol = Math.max(maxcol,j);
                }
            }
        }
        return (maxrow - minrow+1)*(maxcol - mincol+1);
    }
}