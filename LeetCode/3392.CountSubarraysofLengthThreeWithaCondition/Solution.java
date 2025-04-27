class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=2;i<n;i++){
            int sum=(nums[i-2]+nums[i])*2;
            if(sum== nums[i-1]){
                count++;
            }
        }

        return count;
    }
}