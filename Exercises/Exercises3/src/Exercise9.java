public class Exercise9 {
    public static class LinkedList {
        Node head;

        static class Node {
            int data;
            Node next;

            Node (int data) {
                this.data = data;
                next = null;
            }
        }

        public static void insert (LinkedList list, int data) {
            Node new_node = new Node(data);
            new_node.next = null;

            if (list.head == null) {
                list.head = new_node;
            }
            else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
        }
        public static int size (LinkedList list) {
            int count = 0;
            Node current = list.head;
            if (list.head == null) {
                return 0;
            }
            while (current != null) {
                current = current.next;
                count += 1;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);

        System.out.println(list.size(list));
    }
}
