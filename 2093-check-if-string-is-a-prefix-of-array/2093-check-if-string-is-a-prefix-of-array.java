class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int len = 0;
        String str = "";
        for(int i=0 ; i<words.length ; i++){
            str = str.concat(words[i]);
            if(str.equals(s)) return true;
        }
        return false;
    }
}