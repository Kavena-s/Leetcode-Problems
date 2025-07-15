class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)return false;
        int cou = 0;
        int vow = 0;
        int cons = 0;
        for(int i=0 ; i<word.length() ; i++){
            if(Character.isLetter(word.charAt(i))){
                cou ++;
                char c = word.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    vow ++;
                else 
                    cons ++;
            }
            else if(Character.isDigit(word.charAt(i)))
                cou ++;
            else
                return false;
        }
        if(vow >= 1 && cons >= 1 && cou >=3)return true;
        return false;
    }
}