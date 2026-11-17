public class LinkedListPart1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public static void doPrint() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void addAnyIndex(int index, int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        if (index == 1) {
            size--;
            addFirst(data);
            return;
        }
        Node temp = head;
        while (temp != null && index - 1 > 1) {
            temp = temp.next;
            index--;
        }
        if (temp == null) {
            System.out.println("enter valid index");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        }
        size--;
        int data = head.data;
        head = head.next;
        return data;

    }

    public static int removeLast() {
        if (head == null) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        int data = tail.data;

        if (size == 1) {
            head = tail = null;
            size--;
            return data;
        }
        size--;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return data;

    }

    public static int removeAnyIndex(int index) {
        if (size == 0) {
            return -1;
        }
        if (index == 1) {
            return removeFirst();
        }
        Node temp = head;
        while (temp != null && index - 1 > 1) {
            temp = temp.next;
            index--;
        }
        if (temp == null) {
            System.out.println("enter valid index");
            return -1;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return data;
    }

    public static int findKey(int key) {
        if (head == null) {
            return -1;
        }
        int index = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static int findKeyRecursive(int key, Node temp, int index) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return index;
        }
        return findKeyRecursive(key, temp.next, index + 1);
    }

    public static Node reverseLinkedList() {
        if (head == null) {
            return null;
        }
        Node current = tail = head;
        Node pre = null;
        Node future;

        while (current != null) {
            future = current.next;
            current.next = pre;
            pre = current;
            current = future;

        }
        head = pre;
        return head;

    }

    public static void main(String[] args) {
        addFirst(0);
        addFirst(1);
        addLast(5);
        addFirst(2);
        addAnyIndex(1, 10);
        reverseLinkedList();
        doPrint();
        System.out.println();
        

    }
}
