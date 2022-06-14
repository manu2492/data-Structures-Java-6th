
public class Exercise6 {

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

        public static void deletedSecond (LinkedList list) {
            if (list.head == null) {
                return;
            }
            else if (list.head.next == null) {
                return;
            }
            
            Node current = list.head;
            Node p = current.next;
            Node q = p.next;

            while (q.next != null) {
                current = current.next;
                p = p.next;
                q = q.next;
            }
            current.next = q;
        }

        public static void soutt (LinkedList list) {
            Node current = list.head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);

        list.deletedSecond(list);

        list.soutt(list);


        System.out.println(list);
    }
}
