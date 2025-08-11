class Solution {
    public String interpret(String command) {
        String result = new String();
        int i=0;
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                result+="G";
                i++;
            }
            else if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    result+="o";
                    i+=2;
                }
                else{
                    result+="al";
                    i+=4;
                }
            }
        }
        return result;
    }
}