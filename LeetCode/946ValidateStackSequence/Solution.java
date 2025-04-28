class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0; // Pointer to popped array

        for (int val : pushed) {
            st.push(val);

            // Try to pop from stack as long as top matches popped[j]
            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}
