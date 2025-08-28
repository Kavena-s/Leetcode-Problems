/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        int count = 0;
        while(head.next != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA);
        int l2 = length(headB);
        Set<ListNode> s = new HashSet();
        while(l1>l2){
            headA = headA.next;
            l1--;
        }
        while(l2>l1){
            headB = headB.next;
            l2--;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}