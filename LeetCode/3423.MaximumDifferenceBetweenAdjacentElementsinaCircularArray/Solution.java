class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int MaxDiff=Math.abs(nums[0]-nums[n-1]);

        for(int i=0;i<n-1;i++){
            int diff= Math.abs(nums[i]-nums[i+1]); 
            if(diff>MaxDiff){
                MaxDiff= diff;
            }
        }

        return MaxDiff;
    }
}