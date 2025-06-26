class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //Approach-1
        // int ans=left;
        // while(left+1!=right+1){
        //     ans=ans & left;
        //     left++; 
        // }

        // return ans;

        //Approach-2
        int count=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            count++;
        }

        while(count!=0){
            left=left<<1;
            count--;
        }

        return left;
    }
}