class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] tran = new int[n][m];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                tran[j][i] = matrix[i][j];
            }
        }
        return tran;
    }
}