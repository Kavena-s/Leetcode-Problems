class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<operations.length ; i++){
            if(operations[i].equals("D"))list.add(list.get(list.size()-1)*2);
            else if(operations[i].equals("+"))list.add(list.get(list.size()-2)+list.get(list.size()-1));
            else if(operations[i].equals("C"))list.remove(list.size()-1);
            else list.add(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        for(int i=0 ; i<list.size() ; i++){
            sum += list.get(i);
        }
        return sum;
    }
}