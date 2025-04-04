class Solution {
    public int climbStairs(int n) {
        if (n<=1)
            return n;
        int num1=1,num2=1;
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=num1+num2;
            num1=num2;
            num2=ans;
        }
        return ans;
    }
}