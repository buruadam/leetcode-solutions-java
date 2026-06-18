package medium;

public class MinStack {
    private Node head;

    public MinStack() {
        head = null;
    }

    public void push(int value) {
        if (head == null) {
            head = new Node(value, value, null);
        } else {
            int newMin = Math.min(value, head.min);
            head = new Node(value, newMin, head);
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }

    private static class Node {
        int value;
        int min;
        Node next;

        private Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
}
