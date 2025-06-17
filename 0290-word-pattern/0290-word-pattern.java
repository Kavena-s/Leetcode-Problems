class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str1 = s.split(" ");
        String[] str2 = pattern.split("");
        if(str1.length != str2.length)return false;
        int num1 = 1;
        int[] arr1 = new int[str1.length];
        int[] arr2 = new int[str2.length];
        for(int i=0; i<str1.length ; i++){
            if(arr1[i] == 0){
                arr1[i] = num1;
                for(int j=i+1 ; j<str1.length ; j++){
                    if(str1[i].equals(str1[j])) arr1[j] = num1;
                }
            }
            num1++;
        }
        num1 = 1;
        for(int i=0; i<str2.length ; i++){
            if(arr2[i] == 0){
                arr2[i] = num1;
                for(int j=i+1 ; j<str2.length ; j++){
                    if(str2[i].equals(str2[j])) arr2[j] = num1;
                }
            }
            num1++;
        }
        for(int i=0 ; i<arr1.length ; i++){
            if(arr1[i] != arr2[i])return false;
        }
        return true;
    }
}