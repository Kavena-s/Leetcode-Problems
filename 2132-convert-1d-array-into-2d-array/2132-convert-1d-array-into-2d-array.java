class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[0][0];
        int t = 0;
        int[][] mat = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                mat[i][j] = original[t++];
            }
        }
        return mat;
    }
}