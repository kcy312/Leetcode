class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] f = new int[2];
        int n = nums.length;
        for(int i=0; i<=n-2;i++){ 
            for(int j=i+1;j<=n-1;j++){ 
                if(nums[i]+nums[j]==target){
                    f[0]=i;
                    f[1]=j;
                }
            } 
        }
        return f;
    }
}