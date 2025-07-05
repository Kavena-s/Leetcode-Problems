class Solution {
    public int findLucky(int[] arr) {
        int temp[] = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            int count = 1;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j] && arr[i] != 0){
                    count += 1;
                    arr[j] = 0;
                }
            }
            temp[i] = count;
        }
        int lucky = -1;
        for(int i=0 ; i<temp.length ; i++){
            if(arr[i] == temp[i] && arr[i] > lucky)
                lucky = arr[i];
        }
        return lucky;
    }
}
