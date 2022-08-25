package LinkedList.Easy;

public class Binary2D {
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

    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        int count = 1;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        count++;
        int num = 0;
        node = head;
        while (node.next != null) {
            if (node.val == 0) {
                num += 0;
            } else {
                num += Math.pow(2, count - 1);
            }
            node = node.next;
            count--;
        }
        if (node.val == 1) {
            num += 1;
        }
        return num;
    }

    public static void main(String[] args) {

    }
}
