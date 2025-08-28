class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if(n >= (int)Math.sqrt(i*i + j*j) && i * i + j * j  == (int)Math.sqrt(i*i + j*j) * (int)Math.sqrt(i*i + j*j)) count ++;
            }
        }
        return count;
    }
}