// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i =0;i<nums.length;i++){
//         int reqNum = target - nums[i];
//         if(map.containsKey(reqNum)){
//             return new int[]{map.get(reqNum),i};
//         }
//         map.put(nums[i],i);
//        }
//         return new int[]{};
//     }
// }
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: Create a list of pairs (value, original index)
        List<int[]> indexedList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            indexedList.add(new int[]{nums[i], i});
        }
        
        // Step 2: Sort the list based on the values (ascending order)
        indexedList.sort(Comparator.comparingInt(a -> a[0]));
        
        // Step 3: Two-pointer approach on the sorted list
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = indexedList.get(i)[0] + indexedList.get(j)[0];
            if (sum == target) {
                // Return original indices
                return new int[]{indexedList.get(i)[1], indexedList.get(j)[1]};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{}; // In case no pair is found
    }
}
