class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        String str = s.toLowerCase();
        while(left <= right){
            while(left < right && !isAlphaNumeric(str.charAt(left))){
                left++;
            }
            while(left < right && !isAlphaNumeric(str.charAt(right))){
                right--;
            }
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isAlphaNumeric(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
            return true;
        }
        return false;
    }
}
