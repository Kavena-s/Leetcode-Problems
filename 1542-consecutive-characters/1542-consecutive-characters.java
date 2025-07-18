class Solution {
    public int maxPower(String s) {
        int count = 1;
        int temp = 1;
        for(int i=0 ; i<s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i+1))temp++;
            else{
                count = Math.max(count,temp);
                temp =1;
            }
        }
        return Math.max(count,temp);
    }
}