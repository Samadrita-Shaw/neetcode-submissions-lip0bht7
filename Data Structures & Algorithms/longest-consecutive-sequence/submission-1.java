class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int maxCount = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int count = 1;
                int currNum = n;
                while(set.contains(currNum + 1)){
                    currNum++;
                    count++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}
