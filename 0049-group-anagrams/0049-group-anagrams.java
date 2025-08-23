class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> hm = new HashMap();
        for(int i=0 ; i<strs.length ; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String s = String.valueOf(charArr);
            if(!hm.containsKey(s))
                hm.put(s,new ArrayList());
            hm.get(s).add(strs[i]);
        }
        return new ArrayList(hm.values());
    }
}