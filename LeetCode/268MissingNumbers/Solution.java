package LeetCode.268MissingNumbers;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        if(nums[0]!=0) return 0;

        for(int i=0; i<n-1;i++){
            if(nums[i] == (nums[i+1]-1)){

            }else{
                return nums[i]+1;
            }
        }

        return n; 
    }
}
