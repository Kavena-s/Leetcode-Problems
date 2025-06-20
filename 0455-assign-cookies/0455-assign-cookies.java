class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int count = 0;
        int i=0,j=0;
        while(i < g.length && j < s.length){
                if(s[j] >= g[i]){
                    count += 1;
                    i++;
                }
            j++;
        }
        return count;
    }
}