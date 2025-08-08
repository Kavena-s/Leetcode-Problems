class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        while(n != 1 && !hash.contains(n)){
            hash.add(n);
            int sum = 0;
            while(n>0){
                int temp = n % 10;
                sum += temp * temp;
                n /= 10;
            }
            n = sum;
        }
        if(n == 1) return true;
        return false;
    }
}