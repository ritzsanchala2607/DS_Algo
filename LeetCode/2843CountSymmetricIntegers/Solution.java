class Solution {
    public boolean isSymmetric(String n) {
        int len = n.length();
        if (len % 2 == 1) return false; 

        int half = len / 2;
        int firstHalf = 0, secondHalf = 0;

        for (int i = 0; i < half; i++) {
            firstHalf += n.charAt(i) - '0';
        }

        for (int i = half; i < len; i++) {
            secondHalf += n.charAt(i) - '0';
        }

        return firstHalf == secondHalf;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        while (low <= high) {
            if (isSymmetric(Integer.toString(low))) {
                count++;
            }
            low++;
        }

        return count;
    }
}
