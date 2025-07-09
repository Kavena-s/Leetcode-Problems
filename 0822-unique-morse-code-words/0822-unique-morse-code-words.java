class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int count = 0; 
        HashSet<String> hash = new HashSet<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0 ; i<words.length ; i++){
            String str = new String();
            for(int j=0 ; j<words[i].length() ; j++){
                str += morse[words[i].charAt(j) - 'a'];
            }
            hash.add(str);
        }
        return hash.size();
    }
}