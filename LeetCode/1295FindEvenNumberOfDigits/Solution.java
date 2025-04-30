class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int temp: nums){
            int count=0;
            do {
                temp /= 10;
                count++;
            } while (temp != 0);

            if(count%2==0){
                result++;
            }
        }

        return result;
    }
}