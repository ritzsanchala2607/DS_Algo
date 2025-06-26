import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[arr1.length];
        int index = 0;

        for (int x : arr1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int ele : arr2) {
            int freq = map.get(ele);

            while (freq > 0) {
                ans[index] = ele;
                index++;
                freq--;
            }

            map.remove(ele); 
        }

        List<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining);

        for (int ele : remaining) {
            int freq = map.get(ele);

            while (freq > 0) {
                ans[index] = ele;
                index++;
                freq--;
            }
        }

        return ans;
    }
}
