class Solution {
    public int[] diStringMatch(String s) {
        int low = 0;
        int high = s.length();
        int[] num = new int[s.length()+1];
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'I'){
                num[i] = low;
                low++;
            }
            else{
                num[i] = high;
                high--;
            }
        }
        num[s.length()] = low;
        return num;
    }
}