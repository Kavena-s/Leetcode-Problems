class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int area = 0;
        for(int dimension[] : dimensions){
            if(max < Math.sqrt(dimension[0] * dimension[0] + dimension[1] * dimension[1]) || max == Math.sqrt(dimension[0] * dimension[0] + dimension[1] * dimension[1]) && dimension[0] * dimension[1] > area){
                max = Math.sqrt(dimension[0] * dimension[0] + dimension[1] * dimension[1]);
                area = dimension[0] * dimension[1];
            }
        }
        return area;
    }
}