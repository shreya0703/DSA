class Solution {
    public int missingNumber(int[] nums ) {
        int n = nums.length;
        int sum =(n*(n+1))/2;
        int s2=0;
        for(int i = 0;i<nums.length;i++){
           s2= s2+nums[i];
        }
        int missing = sum - s2;
        return missing;
       
    }
   
}