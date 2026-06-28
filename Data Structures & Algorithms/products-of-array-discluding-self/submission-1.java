class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]p=new int[nums.length];
        int[] s=new int[nums.length];
        p[0]=1;
        s[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]*nums[i-1];
        }
        int pr=1;
        for(int i=nums.length-1;i>=0;i--){
            p[i]=pr*p[i];
            pr=pr*nums[i];
        }
       
        return p;

    }
}  
