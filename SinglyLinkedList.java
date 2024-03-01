public class SinglyLinkedList<AnyType extends IDedObject> {

    public static class Node<AnyType extends IDedObject> {
        private AnyType data;
        private Node<AnyType> next;

        public Node(AnyType data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node<AnyType> head; // first node in the list

    // constructor
    public SinglyLinkedList() {
        head = null;
    }

    // makeEmpty
    public void makeEmpty() {
        head = null;
    }

    public AnyType findID(int ID) {
        Node<AnyType> current = head;
        while (current != null) {
            if (current.data.getID() == ID) {
                return current.data;
            }
            current = current.next;
        }

        return null;
    }

    // insert at front of list or return false if that ID already exists
    public boolean insertAtFront(AnyType x) {
        if (findID(x.getID()) == null) {
            // assuming that ID does not exist
            Node<AnyType> insert = new Node<AnyType>(x);
            insert.next = head;
            head = insert;
            return true;
        } else { // ID exists
            return false;
        }
    }

    // delete and return the record at the front of the list or return null if the
    // list is empty
    public AnyType deleteFromFront() {
        if (head == null) {
            // list is empty
            return null;
        }
        Node<AnyType> oldHead = head;
        head = head.next;
        return oldHead.data;

    }

    // find and delete the record with the given ID or returns null if it isn’t
    // found
    public AnyType delete(int ID) {
        Node<AnyType> current = head;
        Node<AnyType> previous = null;
        while (current != null && current.data.getID() != ID) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            if (previous == null) {
                head = current.next;
            } else {
                previous.next = current.next;
            }
            return current.data;
        }
        return null; // ID not in list
    }

    // print list
    public void printAllRecords() {
        Node<AnyType> current = head;
        while (current != null) {
            current.data.printID();
            current = current.next;
        }
    }

}
