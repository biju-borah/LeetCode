package LinkedList.Easy.Medium;

public class RemoveN {
    ListNode head;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void printLinkedList() {
        ListNode node = head;
        while (node.next != null) {
            System.out.print(node.data);
            System.out.print("-->");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void addNode(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            node.next = null;
            return;
        }
        ListNode n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void deleteNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void reverse() {
        ListNode node = head;
        ListNode nextNode = node.next;
        while (nextNode != null) {
            ListNode temp = nextNode.next;
            System.out.println(node.data);
            nextNode.next = node;
            node = nextNode;
            nextNode = temp;
        }
        System.out.println(node.data);
        head.next = null;
        head = node;
        printLinkedList();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode node = head;
        ListNode nextNode = node;
        while (nextNode != null) {
            nextNode = nextNode.next;
            count++;
            if (count == n) {
                break;
            }
        }
        ListNode temp = node;
        while (nextNode != null) {
            temp = node;
            node = node.next;
            nextNode = nextNode.next;
        }
        // node.data = node.next.data;
        if (node == head) {
            return node.next;
        } else if (node.next == null) {
            temp.next = null;
        } else {
            temp.next = temp.next.next;
        }

        printLinkedList();
        return head;
    }

    public static void main(String[] args) {
        RemoveN LL = new RemoveN();
        LL.addNode(5);
        LL.addNode(4);
        LL.addNode(3);
        LL.addNode(2);
        LL.removeNthFromEnd(LL.head, 4);
    }
}
