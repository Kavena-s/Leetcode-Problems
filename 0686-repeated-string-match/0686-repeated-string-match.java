class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int num =(int) Math.ceil((double)b.length()/a.length());
        for(int i=0 ; i<num ; i++){
            sb.append(a);
        }
        if(sb.toString().contains(b)) return num;
        sb.append(a);
        if(sb.toString().contains(b)) return num+1;
        return -1;
    }
}