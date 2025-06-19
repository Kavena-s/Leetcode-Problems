class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr1 = jewels.toCharArray();
        int count = 0;
        for(char ch:arr1){
            for(char ch2:stones.toCharArray()){
                if(ch == ch2)count += 1;
            }
        }
        return count;
    }
}