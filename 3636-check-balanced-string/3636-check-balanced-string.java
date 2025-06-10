class Solution {
    public boolean isBalanced(String num) {
        if(num.length() == 1)return false;
        String[] arr = num.split("");
        int odd = 0;
        int even = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(i % 2 == 0) even += Integer.valueOf(arr[i]);
            else odd += Integer.valueOf(arr[i]);
        }
        return odd == even;
    }
}