int removeElement(int* nums, int numsSize, int val) {
    int k =0;
    int size=numsSize;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==val){
            nums[i]='_';
            size--;
        }
        else
            k++;
    }
    int t=0;
    if (size>0){
        int temp[size];
        for(int i=0;i<numsSize;i++){
        if(nums[i] != '_')
            temp[t++]=nums[i];
        }
        numsSize=size;
        for(int i=0;i<size;i++){
            nums[i]=temp[i];
        }
    }
    
    return k;
}