class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for(char ch : s1.toCharArray()){
            s1Count[ch - 'a']++;    // eg: 'a' = 1, 'b' = 1, 'c' = 1
        }

        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            windowCount[s2.charAt(right) - 'a']++;

            //shriking the window if it exceeds the s1 length
            if(right - left + 1 > s1.length()){
                windowCount[s2.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(s1Count, windowCount)){
                return true;
            }
        }
        return false;
    }
}