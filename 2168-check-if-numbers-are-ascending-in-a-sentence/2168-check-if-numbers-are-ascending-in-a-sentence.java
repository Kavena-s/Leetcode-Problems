class Solution {
    public boolean areNumbersAscending(String s) {
        int num = 0;
        String[] words = s.split(" ");  
        for(int i=0 ; i<words.length ; i++){
            if(Character.isDigit(words[i].charAt(0))){
                if(Integer.parseInt(words[i]) > num) num = Integer.parseInt(words[i]);
                else return false;
            }
        }
        return true;
    }
}