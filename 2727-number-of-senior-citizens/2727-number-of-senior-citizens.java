class Solution {
    public int countSeniors(String[] details) {
        int sum = 0;
        for(int i=0 ; i<details.length ; i++){
            String str = details[i];
            if((str.charAt(11) - '0') >6 &&  (str.charAt(12) - '0') >= 0)
                sum = sum + 1;
            else if((str.charAt(11) - '0') == 6 &&  (str.charAt(12) - '0') > 0)
                sum = sum + 1;
            else 
                continue;
        }
        return sum;
    }
}