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

public class SolutionQ2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        while (l1.next!=null){
            stringBuilder1.append(l1.next.val);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        while (l2.next!=null){
            stringBuilder2.append(l2.next.val);
        }
        int i1 = Integer.parseInt(stringBuilder1.toString());
        int i2 = Integer.parseInt(stringBuilder2.toString());
        int result = i1+i2;
        System.out.println(result);
        return new ListNode(result);
    }
}
