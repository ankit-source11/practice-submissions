/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode node = head;
        int k = 0;
        while (node != null) {
            k++;
            node = node.next;
        }
        k = k-n;
        node = dummyNode;
        while (k>0) {
            --k;
            node = node.next;
        }
        node.next = node.next.next;
        return dummyNode.next;
    }
}
