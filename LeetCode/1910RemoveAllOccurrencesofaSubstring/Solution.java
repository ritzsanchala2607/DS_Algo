class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();
        int partLen = part.length();

        for (char c : s.toCharArray()) {
            result.append(c);
            if (result.length() >= partLen && 
                result.substring(result.length() - partLen).equals(part)) {
                result.setLength(result.length() - partLen); // remove last 'partLen' chars
            }
        }

        return result.toString();
    }
}
