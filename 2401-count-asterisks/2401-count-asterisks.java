class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int pair = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '|') pair += 1;
            if(s.charAt(i) == '*' && pair % 2 == 0) count ++;
        }
        return count;
    }
}