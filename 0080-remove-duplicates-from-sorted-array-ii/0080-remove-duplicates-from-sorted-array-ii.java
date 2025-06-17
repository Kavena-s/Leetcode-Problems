class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> num = new ArrayList<>();
        List<Integer> cou = new ArrayList<>();
        int i=0;
        int ind = 0;
        while(i<nums.length){
            int count = 1;
            int temp = i;
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]) count ++;
                else break;
                temp = j;
            }
            num.add(nums[i]);
            cou.add(count);
            i = temp+1;
        }
        i=0;
        int temp = 0;
        int count = 0;
        while(i<cou.size()){
            if(cou.get(i)==1){
                nums[temp++] = num.get(i);
                count += 1;
                i++;
            }
            else{
                nums[temp++] = num.get(i);
                nums[temp++] = num.get(i);
                count += 2;
                i++;
            }

        }
        return count;
    }
}