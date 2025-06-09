class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0 ; i<list1.length ; i++){
            for(int j=0 ; j<list2.length ; j++){
                if(list1[i].equals(list2[j]) && i+j < min)
                    min = i+j;
            }
        }
        for(int i=0 ; i<list1.length ; i++){
            for(int j=0 ; j<list2.length ; j++){
                if(list1[i].equals(list2[j]) && i+j == min) 
                    arr.add(list1[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}