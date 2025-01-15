class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0; // Position to write the compressed characters
        int read = 0;  // Position to read characters
        
        while (read < n) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count occurrences of the current character
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character
            chars[write++] = currentChar;
            
            // Write the count if greater than 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write; // The new length of the compressed array
    }
}
