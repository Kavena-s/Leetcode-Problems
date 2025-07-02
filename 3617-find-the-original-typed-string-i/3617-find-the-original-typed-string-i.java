class Solution {
    public int possibleStringCount(String word) {
        char[] arr = word.toCharArray();
        List<Character> l = new ArrayList<>();
        l.add(arr[0]);
        int i=0;
        while(i<word.length()-1){
            if(arr[i] != arr[i+1]){
                l.add(arr[i+1]);
            }
            i++;
        }
        return word.length() - l.size() + 1;
    }
}