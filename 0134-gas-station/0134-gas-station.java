class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum = 0;
        int costsum = 0;
        int start_ind = 0;
        int tank = 0;
        for(int i=0 ; i<gas.length ; i++){
            gassum += gas[i];
            costsum += cost[i];
            tank += gas[i]-cost[i];
            if(tank < 0){
                start_ind = i+1;
                tank = 0;
            }
        }
        return gassum-costsum >= 0 ? start_ind : -1;
    }
}