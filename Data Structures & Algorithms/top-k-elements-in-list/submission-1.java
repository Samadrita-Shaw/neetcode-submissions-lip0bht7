class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i : count.keySet()){
            buckets[count.get(i)].add(i);
        }

        int[] result = new int[k];
        List<Integer> temp = new ArrayList<>();
        for(int i = buckets.length - 1 ; i >= 0; i--){
            List<Integer> list = buckets[i];
            for(int j : list){
                temp.add(j);
            }
        }
        while(k-- > 0){
            result[k] = temp.get(k);
        }
        return result;
    }
}
