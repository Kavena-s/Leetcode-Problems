class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int last = arr.length-1;
        return arr[last].length();
    }
}