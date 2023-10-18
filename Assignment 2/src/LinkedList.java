public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    //DONE
    public Object addFirst(Object element) {
        //create a new node
        Node newHead = new Node(element, head);
        //set the head to the new node
        head = newHead;
        //increase the size of the list
        size = size + 1;
        //return the new first
        return newHead;
    }
    //DONE
    public Object removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            //Set head to a temporary node to delete
            Node temp = head;
            // make next node new head
            head = head.getNext();
            //make head's next pointer null
            temp.setNext(null);
            //decrement the counter
            size = size - 1;
            //get the element of the deleted node
            return temp.getElement();
        }
    }
    //DONE
    public Object addLast(Object element) {
        // Create a new node
        Node newLast = new Node(element, null);
        // If the list is empty, the new node is both the head and the tail
        if (head == null) {
            head = tail = newLast;
        } else {
            // Otherwise, make the old tail node point to the new node
            tail.setNext(newLast);
            // Make the new node the new tail
            tail = newLast;
        }
        // Increment the size
        size = size + 1;
        // Return the new last node
        return newLast;
    }


    public Object removeLast() {
        // case when there is only one node left
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        else if (head.getNext() == null) {
            Object element = head.getElement();
            head = null;
            tail = null;
            size = size - 1;
            return element;
        }
        else {
            // Set the head to be a temporary node to traverse list
            Node current = head;
            // Traverse list
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            // Get the element of the old tail (before it's removed)
            Object element = tail.getElement();
            // Delete the last node by making it null value
            tail.setNext(null);
            // Make current the new tail
            tail = current;
            // Decrement the list size
            size = size - 1;
            // Return the element of the deleted node
            return element;
        }
    }

        public Object getFirst() {
            //error handling for empty list
            if (head == null) {
                System.out.println("List is empty");
                return null;
            } else {
                //returning the head element
                return head.getElement();
            }
        }

        public Object getLast () {
            //error handling for empty list
            if (tail == null) {
                System.out.println("List is empty");
                return null;
            } else {
                //returning the last element
                return tail.getElement();
            }
        }
    }

        //
//        public Object getPrevious () {
//
//
//            return v.getPrevious();
//        }
//
//        public Object getNext () {
//
//        }
//
//        public int size () {
//            return size;
//        }
//    }
//}
//
