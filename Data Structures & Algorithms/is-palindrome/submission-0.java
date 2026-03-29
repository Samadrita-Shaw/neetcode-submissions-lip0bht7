class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() == 1) return true;
        String str = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !isAlphaNum(str.charAt(left))){
                left++;
            }
            while(left < right && !isAlphaNum(str.charAt(right))){
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

    public boolean isAlphaNum(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
            return true;
        }
        return false;
    }
}