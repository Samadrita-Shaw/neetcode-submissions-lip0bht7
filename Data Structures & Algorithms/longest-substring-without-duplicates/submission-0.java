class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, result = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1, left);
            }
            map.put(s.charAt(right), right);
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}