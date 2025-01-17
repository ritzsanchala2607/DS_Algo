//Approach-1 logical based
class Solution {
    public boolean allCapitals(String word) {
        for (char ch : word.toCharArray()) {
            if (ch < 'A' || ch > 'Z') {
                return false;
            }
        }
        return true;
    }

    public boolean allSmall(String word) {
        for (char ch : word.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                return false;
            }
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        return allCapitals(word) || allSmall(word) || allSmall(word.substring(1));
    }
}

// Approach-2 Small and simple code
class Solution {
    public boolean detectCapitalUse(String word) {
        int countCapitals = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                countCapitals++;
            }
        }

        if (countCapitals == 0) {
            return true;
        }

        if (countCapitals == word.length()) {
            return true;
        }

        if (countCapitals == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}
