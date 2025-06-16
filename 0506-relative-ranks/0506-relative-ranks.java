class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = new int[score.length];
        for(int i=0 ; i<score.length ; i++){
            int count = 1;
            for(int j=0 ; j<score.length ; j++){
                if(i != j && score[i] < score[j]) count += 1;
            }
            arr[i] = count;
        }
        String[] str = new String[score.length];
        for(int i=0 ; i<score.length ; i++){
            if(arr[i] == 1)str[i] = "Gold Medal";
            else if(arr[i] == 2)str[i] = "Silver Medal";
            else if(arr[i] == 3)str[i] = "Bronze Medal";
            else str[i] = String.valueOf(arr[i]);
        }
        return str;
    }
}