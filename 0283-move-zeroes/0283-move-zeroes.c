void moveZeroes(int* nums, int numsSize) {
    int temp = 0;
    for(int i=0; i<numsSize ; i++ ){
        if(nums[i] != 0){
            nums[temp]=nums[i];
            temp++;
        }
    }
    while(temp<numsSize){
        nums[temp]=0;
        temp++;
    }
}