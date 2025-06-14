class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        int num1 = arr[0];
        int num2 = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(num1 == 9 && arr[i] !=9){
                num1 = arr[i];
            }
        }
        int[] temp1 = new int[arr.length];
        int[] temp2 = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == num1) temp1[i]=9;
            else temp1[i]=arr[i];
            if(arr[i] == num2) temp2[i]=0;
            else temp2[i]=arr[i];
        }
        int digit1 = 0;
        int digit2 = 0;
        for(int i=0 ; i<arr.length ; i++){
            digit1 = digit1*10 + temp1[i];
            digit2 = digit2*10 + temp2[i];
        }
        return digit1 - digit2 ;
    }
}