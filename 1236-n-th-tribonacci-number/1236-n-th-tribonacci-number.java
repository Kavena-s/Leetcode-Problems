class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==2 || n==1)return 1;
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        for(int i=0 ; i<n-2 ; i++){
            int sum = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = sum;
        }
        return n3;
    }
}