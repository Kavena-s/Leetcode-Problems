class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] hei = Arrays.copyOf(heights,heights.length);
        int[] num = new int[heights.length];
        Arrays.sort(heights);
        for(int i=0 ; i<heights.length ; i++){
            for(int j=0 ; j<heights.length ; j++){
                if(heights[i] == hei[j]) 
                    num[i] = j;
            }
        }
        String[] str = new String[names.length] ;
        for(int i=0 ; i<names.length ; i++){
            str[i] = names[num[i]];
        }
        int temp = names.length-1;
        for(int i=0 ; i<names.length ; i++){
            names[i] = str[temp];
            temp -= 1;
        }
        return names;
    }
}