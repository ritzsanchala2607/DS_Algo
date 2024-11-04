package LeetCode.3163StringCompressionIII;

class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while (i < n) {
            char currentChar = word.charAt(i);
            int count = 0;

            // Count the occurrences of the current character
            while (i < n && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }

            // Append the compressed form (count followed by the character)
            ans.append(count).append(currentChar);
        }
        return ans.toString();
    }
}

