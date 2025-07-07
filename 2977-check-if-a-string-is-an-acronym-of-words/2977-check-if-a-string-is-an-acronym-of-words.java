class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ac = new String();
        for(int i=0 ; i<words.size() ; i++){
            ac += words.get(i).charAt(0);
        }
        if(s.equals(ac))return true;
        return false;
    }
}