class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Using streams
        return Arrays.stream(nums)
            .distinct()
            .count() < nums.length;
    }
}