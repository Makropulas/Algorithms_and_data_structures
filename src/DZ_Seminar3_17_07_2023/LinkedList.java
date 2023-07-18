package DZ_Seminar3_17_07_2023;

public class LinkedList {
    private Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(value);
        }
    }

    public void reverse() {
        if (root != null && root.next != null) {
            Node temp = root;
            reverse(root.next, root);
            temp.next = null;
        }
    }

    private void reverse(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            root = currentNode;
        } else {
            reverse(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }

    @Override
    public String toString() {
        Node currentNode = root;
        StringBuilder sbList = new StringBuilder();
        while (currentNode != null) {
            sbList.append(currentNode.value).append(" ");
            currentNode = currentNode.next;
        }
        return sbList.toString();
    }

    private static class Node {
        int value;
        Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

