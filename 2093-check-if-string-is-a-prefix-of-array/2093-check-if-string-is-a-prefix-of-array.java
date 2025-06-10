class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int len = 0;
        for(int i=0 ; i<words.length ; i++){
            len += words[i].length();
            if(len == s.length()){
                String str = "";
                for(int j=0 ; j<=i ; j++){
                    str = str.concat(words[j]);
                    if(str.equals(s)) return true;
                }
            }
        }
        return false;
    }
}