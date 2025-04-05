class Solution {
    public void reverseString(char[] s) {
        char[] ret = Arrays.copyOf(s,s.length);
        int temp = 0;
        for(int i=s.length-1 ; i>=0 ; i--){
            s[temp] = ret[i];
            temp += 1;
        }
    }
}