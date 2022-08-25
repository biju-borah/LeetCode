package LinkedList.Easy;

public class MiddleLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        int count = 1;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        count++;
        int target = count % 2 == 0 ? count / 2 : (count / 2) + 1;
        node = head;
        while (target > 0) {
            node = node.next;
            count--;
        }
        return node;
    }

    public static void main(String[] args) {

    }
}
