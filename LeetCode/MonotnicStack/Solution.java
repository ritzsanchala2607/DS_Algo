import java.util.*;
public class Solution {
    public static int[] monoStack(int[] arr) {
    int[] ans = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    
    for (int i = arr.length - 1; i >= 0; i--) {
        while (!st.empty() && arr[i] >= st.peek()) {
            st.pop();
        }
        
        if (st.empty()) {
            ans[i] = -1;
        } else {
            ans[i] = st.peek();
        }
        
        st.push(arr[i]);
    }
    
    return ans;
    }

    public static void main(String[] args){
        int[] arr= {5,3,1,2,4,6};
        monoStack(arr);
    }    
}
