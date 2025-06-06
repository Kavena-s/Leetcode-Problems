class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        for(int i=0 ; i<word.length() ; i++){
            if(ch == word.charAt(i)){
                index = i;
                break;
            }
        }
        String s1 = word.substring(0,index+1);
        String s2 = word.substring(index+1);
        String reversed = new StringBuilder(s1).reverse().toString();
        String newstring = reversed+s2;
        return newstring;
    }
}