class Solution {
    public String truncateSentence(String s, int k) {
        String ans = new String();
        String[] arr = s.split(" ");
        if(k == arr.length)return s;
        for(int i=0 ; i<k ; i++){
            if(i != k-1)
                ans += arr[i] + " ";
            else ans += arr[i];
        }
        return ans;
    }
}