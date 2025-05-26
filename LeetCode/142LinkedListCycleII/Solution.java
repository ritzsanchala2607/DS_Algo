package 142LinkedListCycleII;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = head;

        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            } else {
                visited.add(temp);
                temp = temp.next;
            }
        }
        return null;
    }
}
