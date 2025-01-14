    package LeetCode.RotateString;

    class Solution {
        public boolean rotateString(String s, String goal) {
            // Check if lengths are the same; if not, s can't be rotated to become goal
            if (s.length() != goal.length()) {
                return false;
            }
            
            // Concatenate s with itself
            String doubled = s + s;
            
            // Check if goal is a substring of the doubled string
            return doubled.contains(goal);
        }
    }
