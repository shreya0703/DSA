class Solution {
    public void sortColors(int[] nums) {
        int cout0 = 0;
        int cout1 =0;
        int cout2 =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                cout0++;
            }else if(nums[i] ==1){
                cout1++;
            }else{
                cout2++;
            }
        }
    
        for(int i =0 ; i<nums.length; i++){
            nums[i] = 0;
          
        }
        for(int i =cout0 ; i<nums.length; i++){
            nums[i] = 1;
          
        }
        for(int i = cout0 +cout1 ; i<nums.length; i++){
            nums[i] = 2;
           
        }
        
        
    }
}