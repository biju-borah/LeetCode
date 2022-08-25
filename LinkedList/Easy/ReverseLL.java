package LinkedList.Easy;

class ReverseLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void printLinkedList() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data);
            System.out.print("-->");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = null;
            return;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void reverse() {
        Node node = head;
        Node nextNode = node.next;
        while (nextNode != null) {
            Node temp = nextNode.next;
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

    public static void main(String[] args) {
        ReverseLL LinkedList = new ReverseLL();
        LinkedList.addNode(5);
        LinkedList.addNode(4);
        LinkedList.addNode(3);
        LinkedList.addNode(2);
        LinkedList.addNode(1);
        LinkedList.reverse();
    }
}