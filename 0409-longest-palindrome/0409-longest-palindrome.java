class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[52];
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c))arr[c-'a']++;
            else arr[c - 'A' + 26]++;
        }
        int pal = 0;
        int odd = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2 == 0) pal += arr[i];
            else{
                odd++;
                pal+=arr[i]-1;
            }
        }
        if(odd==0) return pal;
        return pal+1;
    }
}