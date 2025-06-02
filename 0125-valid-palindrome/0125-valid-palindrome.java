class Solution {
    public boolean isPalindrome(String s) {
    String alphanumeric = s.replaceAll("[^a-zA-Z0-9]","");
    String lowered = alphanumeric.toLowerCase();
    String reverse = new StringBuilder(lowered).reverse().toString();
    if(reverse.equals(lowered)) return true;
    return false;
    }
}