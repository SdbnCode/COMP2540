public class LinkedList {
    private Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }
    //DONE
    public void addFirst(Object element) {
        //create a new node
        Node newHead = new Node(element, head);
        //set the head to the new node
        head = newHead;
        //increase the size of the list
        size = size + 1;
    }
    //DONE
    public Object removeFirst() {
        //checking for empty list
        if (isEmpty())  {
            return "List is empty";
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
    public void addLast(Object element) {
        // Create a new node
        Node newLast = new Node(element, null);
        if (isEmpty()) {
           head = newLast;
       } else {
           //creating a pointer and set it to head
           Node current = head;
           //using pointer traverse the linked list until the next node is null
           while(current.getNext() !=null){
               //make current the next node everytime condition fails
               current = current.getNext();
           }
           //once the end is reached set the pointer to be the newLast node
           current.setNext(newLast);
           // Increment the size
           size = size + 1;
       }
    }


    public Object removeLast() {
        //variable to store element of last node
        Object temp;
        //checking to see if the list is empty
        if (isEmpty()) {
            return "List is empty";
        }
        //check to see if there is only one node in the list
        if (head.getNext() == null) {
            //store the head element in temp and delete node
            temp = head.getElement();
            head = null;
        }
        //for more than one node
        else {
            //create a temporary node to traverse list
            Node current = head;
            //create a node to keep track of node before current
            Node previous = null;
            //traverse the list until the last node
            while (current.getNext() != null) {
                //make previous current so it can follow current
                previous = current;
                //make current the next node in the list before null
                current = current.getNext();
            }
            //store last element in a temporary object
            temp = current.getElement();
            //delete the last node by setting previous to null, cuts off current and connects to null
            previous.setNext(null);
        }
        //decrement the size of the list
        size = size - 1;
        //return the element of the removed node
        return temp;
    }

        public Object getFirst() {
            //checking for empty list
            if (isEmpty()) {
                return "List is empty";
            } else {
                //returning the head element
                return head.getElement();
            }
        }

        public Object getLast () {
            //checking for empty list
            if (isEmpty()) {
                return "List is empty";
            } else {
                Node current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                return current.getElement();
            }
        }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
        }
    }
