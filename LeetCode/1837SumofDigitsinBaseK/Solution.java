class Solution {
    public int sumBase(int n, int k) {
        int ans=0;

        while(n>=1){
          int rem=n%k;
         ans+=rem;
            n=n/k;
        }

        return ans+n/k;
    }
}