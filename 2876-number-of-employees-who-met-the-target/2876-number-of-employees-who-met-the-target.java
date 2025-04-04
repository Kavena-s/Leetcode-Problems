class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int worked_atleast_target = 0;    
        for(int i = 0 ; i < hours.length ; i++){
            if( hours[i] >= target)
                worked_atleast_target += 1;
        }
        return worked_atleast_target;
    }
}