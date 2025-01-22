class Solution {
    public boolean checkFreq(String a) {
        int[] arr = new int[26];

        for (char temp : a.toCharArray()) {
            arr[temp - 'a']++;
            if (arr[temp - 'a'] > 1) return true;
        }

        return false;
    }

    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        // Length mismatch
        if (n != m) return false;

        // Case 1: s and goal are identical, check for duplicate characters
        if (s.equals(goal)) return checkFreq(s);

        // Case 2: s and goal differ, check for exactly two mismatches
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) li.add(i);
        }

        // If mismatches are not exactly 2, return false
        if (li.size() != 2) return false;

        // Swap the mismatched characters and check if strings become equal
        int i = li.get(0), j = li.get(1);
        char[] sArr = s.toCharArray();
        char temp = sArr[i];
        sArr[i] = sArr[j];
        sArr[j] = temp;

        return new String(sArr).equals(goal);
    }
}
