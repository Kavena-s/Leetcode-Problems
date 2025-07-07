class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";
        int len1 = str1.length();
        int len2 = str2.length();
        while(len1 != len2){
            if(len1 > len2)len1 -= len2;
            else len2 -= len1;
        }
        return str1.substring(0,len1);
    }
}