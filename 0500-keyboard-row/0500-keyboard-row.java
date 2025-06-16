class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i=0 ; i<words.length ; i++){
            String s = words[i].toLowerCase();
            int t = -1;
            int a=0 , b=0 , c=0;
            for(int j=0 ; j<s.length() ; j++){
                char ch = s.charAt(j);
                if(ch == 'q' || ch == 'w' || ch == 'e' || ch == 'r' || ch == 't' || ch == 'y' || ch =='u' || ch == 'i' || ch == 'o' || ch == 'p') a = 1;
                else if(ch == 'a' || ch == 's' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l') b = 1;
                else c = 1;
            }
            if((a==1 && b==0 && c==0) || (a==0 && b==1 && c==0) || (a==0 && b==0 && c==1))
                list.add(words[i]);
        }
        return list.toArray(new String[0]);
    }
}