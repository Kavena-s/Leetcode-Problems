class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] r = new int[m];
        int[] c = new int[n];
        for(int[] i : indices){
            r[i[0]]++;
            c[i[1]]++;
        }
        int odd = 0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                int temp = r[i] + c[j];
                if(temp % 2 == 1) odd++;
            }
        }
        return odd;
    }
}