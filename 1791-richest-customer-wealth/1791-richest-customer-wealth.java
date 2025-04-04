class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int temp = 0;
        for(int i=0 ; i<accounts.length ; i++){
            for(int j=0 ; j<accounts[i].length ; j++){
                temp = temp + accounts[i][j]; 
            }
            if(temp > sum)
                sum = temp;
            temp =0;
        }
        return sum;
    }
}