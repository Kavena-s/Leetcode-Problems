class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> key_ind = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == key)key_ind.add(i);
        }
        for(int i=0 ; i<nums.length ; i++){
            int ind = i;
            for(int j=0 ; j<key_ind.size();j++){
                if(Math.abs(i - key_ind.get(j)) <= k){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}