bool canJump(int* nums, int numsSize) {
    int temp=nums[0];
    if (temp==0){
        if(numsSize>1)
            return 0;
        else
            return 1;
    }
    for(int i=1;i<numsSize;i++){
        temp=temp-1;
        if(temp<nums[i])
            temp=nums[i];
        if(temp==0 && i<numsSize-1)
            return 0;
    }
    return 1;
}