class Solution {
    public int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        String[] temp = s.trim().split("\\s+");
        return temp.length;
    }
}
