class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0;i<nums.length;i++){
        int reqNum = target - nums[i];
        if(map.containsKey(reqNum)){
            return new int[]{map.get(reqNum),i};
        }
        map.put(nums[i],i);
       }
        return new int[]{};
    }
}