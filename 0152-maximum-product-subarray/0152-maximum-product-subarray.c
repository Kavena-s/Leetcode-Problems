int maxProduct(int* nums, int numsSize) {
    if (numsSize == 0) 
        return 0; 

    int max_product = nums[0], min_product = nums[0], result = nums[0];

    for (int i = 1; i < numsSize; i++) {
        if (nums[i] < 0) {
            int temp = max_product;
            max_product = min_product;
            min_product = temp;
        }

        
        max_product = (nums[i] > max_product * nums[i]) ? nums[i] : max_product * nums[i];
        min_product = (nums[i] < min_product * nums[i]) ? nums[i] : min_product * nums[i];

        if (max_product > result) {
            result = max_product;
        }
    }
    
    return result;
}