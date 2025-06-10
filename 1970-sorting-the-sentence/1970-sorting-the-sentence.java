class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] temp = new String[str.length];
        for(int i=0 ; i<str.length ; i++){
            for(int j=0 ; j<str.length ; j++){
                if(Character.getNumericValue(str[j].charAt(str[j].length()-1)) == i+1){
                    temp[i] = str[j].substring(0,str[j].length()-1);
                }
            }
        }
        s = String.join(" ",temp);
        return s;
    }
}