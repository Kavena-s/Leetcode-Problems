class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0 ; i<arr.length - 2 ; i++){
            int count= 0;
            for(int j=i ; j<i+3 ; j++){
                if(arr[j] % 2 == 1) count += 1;
            }
            if(count == 3) return true;
        }
        return false;
    }
}