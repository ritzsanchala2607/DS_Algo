class Solution {
    public boolean isPowerOfTwo(int n) {
        //Approach-1
        // boolean answer=false;
        // for(int i=0;i<=31;i++){
        //     if(Math.pow(2,i)==n){
        //         return true;
        //     }
        // }
        // return false;

        //Approach-2
        if(n<=0) return false;

        return (n&(n-1))==0;
    }
}