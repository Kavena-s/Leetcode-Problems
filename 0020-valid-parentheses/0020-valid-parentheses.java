class Solution {
    public boolean isValid(String s) {
        Map <Character, Character> hm = new HashMap(){{
            put('}','{');
            put(')','(');
            put(']','[');
        }};
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '[')
                stack.push(c);
            else if(stack.isEmpty() || stack.pop() != hm.get(c)) 
                return false;
        }
        return stack.isEmpty();
    }
}