class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder str = new StringBuilder();
        for(char c : binary.toCharArray()){
            str.append(c == '0'? '1' : '0');
        }
        return Integer.parseInt(str.toString(),2);
    }
}