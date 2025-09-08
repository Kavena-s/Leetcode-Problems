class Solution {
    public boolean checkzero(int n){
        while(n > 0){
            if(n % 10 == 0)return false;
            n /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int n1 = 1;
        int n2 = n-1;
        while(true){
            if(checkzero(n1) && checkzero(n2)) return new int[]{n1 , n2};
            n1 += 1;
            n2 -= 1;
        }
    }
}