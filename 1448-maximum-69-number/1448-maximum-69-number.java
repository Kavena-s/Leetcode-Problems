class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] str = s.toCharArray();
        for(int i=0 ; i<str.length ; i++){
            if(str[i] == '6'){
                str[i] = '9';
                break;
            }
        }
        s = new String(str);
        num = Integer.valueOf(s);
        return num;
    }
}