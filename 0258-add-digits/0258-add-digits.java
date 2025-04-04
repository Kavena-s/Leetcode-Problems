class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                int temp = num % 10;
                sum += temp;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}