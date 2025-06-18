class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int adj = 0;
                if(grid[i][j] == 1){
                    if(i!=0){
                        if(grid[i-1][j]==1) adj+=1;
                    }
                    if(j!=0){
                        if(grid[i][j-1]==1) adj+=1;
                    }
                    if(i!=r-1){
                        if(grid[i+1][j]==1) adj+=1;
                    }
                    if(j!=c-1){
                        if(grid[i][j+1]==1) adj+=1;
                    }
                    count += 4 - adj;
                }
            }
        }
        return count;
    }
}