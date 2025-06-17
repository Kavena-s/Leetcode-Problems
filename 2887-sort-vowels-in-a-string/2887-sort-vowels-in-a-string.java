class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] =='A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                vowels.add(arr[i]);
                indices.add(i);
            }
        }

        Collections.sort(vowels);
        for (int i = 0; i < indices.size(); i++) {
            arr[indices.get(i)] = vowels.get(i);
        }

        return new String(arr);
    }
}
