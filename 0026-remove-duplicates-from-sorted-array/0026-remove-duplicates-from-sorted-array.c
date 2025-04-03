int removeDuplicates(int* nums, int numsSize) {
    int len=numsSize;
    int k=numsSize;
    if(numsSize>0){
        for(int i=0;i<numsSize;i++){
            for(int j=i+1;j<numsSize;j++){
                if(nums[i] == nums[j] && nums[i]!= 32767){
                    nums[j]= 32767;
                    len--;
                    k--;
                }
            }
        }
        int num[len];
        int t=0;
        for(int i=0;i<numsSize;i++){
            if(nums[i] != 32767){
                num[t++]=nums[i];
            }
        }
        numsSize=len;
        for(int i=0;i<len;i++){
            nums[i]=num[i];
        }
    }

    return k;
}