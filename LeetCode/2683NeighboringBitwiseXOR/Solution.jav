class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;// length of array
        int count=0;

        //check set bits in  array
        for (int i=0;i<n; i++){
            //if set bit occurs count will be +1
            if(derived[i]==1) count++;
        }

        return count%2==0;
    }
}