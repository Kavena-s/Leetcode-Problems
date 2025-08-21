class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hash = new HashSet();
        int pairs = 0;
        for(char c : s.toCharArray()){
            if(hash.contains(c)){
                pairs++;
                hash.remove(c);
            }
            else hash.add(c);
        }
        if(hash.isEmpty()) return 2 * pairs;
        return 2 * pairs + 1;
    }
}