class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length==1){
            if(flowerbed[0]==0) return n<=1;
            else return n==0;
        }
        for(int i=0; i<flowerbed.length ; i++){
            if(i==0){
                if(flowerbed[0] == 0 && flowerbed[1] == 0){
                    flowerbed[i]=1;
                    n--;
                }     
                if(n==0)return true;
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[flowerbed.length-1] = 1;
                    n--;
                }
                if(n==0)return true;
            }
            else{
                if(flowerbed[i] == 0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
                if(n==0)return true;
            }
        }
        return false;
    }
}