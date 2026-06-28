class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        while(i<=nums.length-2){
            if(j>nums.length-1){
            j=0;
            i+=1;}
            if(i!=j && target==nums[i]+nums[j])
            {
                return new int[]{i,j};
            }
            j++;
        }
        return new int[]{-1,-1};

    }
}
