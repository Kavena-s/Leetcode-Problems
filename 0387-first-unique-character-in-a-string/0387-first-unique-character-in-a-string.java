class Solution {
    public int firstUniqChar(String s) {
        for(int i=0 ; i<s.length() ; i++){
            int temp = 0;
            for(int j=0 ; j<s.length() ; j++){
                if(i==j)continue;
                if(s.charAt(i) == s.charAt(j)){
                    temp = 1;
                    break;
                }
            }
            if(temp == 0)return i;
        }
        return -1;
    }
}