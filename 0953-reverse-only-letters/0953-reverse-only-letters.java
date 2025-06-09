class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(Character.isLetter(arr[left]) && Character.isLetter(arr[right])){
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;
                left += 1;
                right -=1;
            }
            else if(!Character.isLetter(arr[left]) && Character.isLetter(arr[right])){
                left += 1;
            }
            else{
                right -=1;
            }
        }
        String str = new String(arr);
        return str;
    }
}