class Solution {
    public boolean digitCount(String num) {
        for(int i=0 ; i<num.length() ; i++){
            int count = 0;
            for(int j=0 ; j<num.length() ; j++){
                if(i == num.charAt(j) - '0') count +=1;
            }
            if (count != num.charAt(i) - '0') return false;
        }
        return true;
    }
}