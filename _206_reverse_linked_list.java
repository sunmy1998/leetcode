/**
 * @author: SMY
 * @time: 2025/5/28  22:21
 * @description: 206. 反转链表
 *   <a href="https://leetcode.cn/problems/reverse-linked-list/description/">...</a>
 */

public class _206_reverse_linked_list {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        ListNode reversed = reverseList(listNode);
        while(reversed != null) {
            System.out.print(reversed.val);
            reversed = reversed.next;
        }
    }

}
