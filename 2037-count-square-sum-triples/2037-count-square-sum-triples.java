class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                int a = (int)Math.sqrt(i*i + j*j);
                int b = i * i + j * j ;
                if(n >= a && b == a * a) count ++;
            }
        }
        return count;
    }
}