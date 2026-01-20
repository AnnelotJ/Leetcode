class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0; i < nums.length; i++){
            int restitution = target - nums[i]; 
                
                if (map.get(restitution) != null && i != map.get(restitution) ){  
                        result[0] = i;
                        result[1] = map.get(restitution);
                        break;   
                }
            map.put(nums[i], i);
            }

            return result;
        }
  
    
}