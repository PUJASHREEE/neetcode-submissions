class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsHash = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            if(numsHash.containsKey(target-nums[i])) {
                return new int[]{numsHash.get(target-nums[i]), i};
            }

            numsHash.put(nums[i], i);
        }

        return new int[]{-1};
    }

}