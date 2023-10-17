public class Node {

    private Object element;
    private Node next;

    //create first node with head and tail = null
    public Node(){
        this(null,null);
    }

    //create a node with the given element and next node
    public Node(Object e, Node n){
        element = e;
        next = n;
    }

    public Object getElement(){
        return element;
    }

    public Node getNext(){
        return next;
    }

    //update element
    public void setElement(Object NewElem){
        element = newElem;
    }
    //moving next to newNode
    public void setNext(Node newNext){
        next = newNext;
    }

    public String addFirst(String e){
        /*create a new node v
        v.setElement(e)
        v,setNext(head)
        size = size + 1;
        head = v;*/
    }

    public String removeFirst{
        if(head== null){
          System.out.println("List is empty");
        }
        else {
            // make head point to next node
        head = head.getNext();
        //make head's next pointer null
        t.setNext(null);
        //decrement the counter
        size = size - 1;
        //get the element of the deleted node
        return t.element();
        }
    }

    public String addLast{
        //create a new node
    v.setElement(e);
    v.setNext(Null)
    //make old tail node point to new node
    tail.setNext(v)
    //link v to the tail
    tail = v;
    //increment counter
    size = size +1;
    return v;
    }

    public String removeLast{

    }

    public String getFirst(){

    }
    public String getLast(){

    }

    public int size(){

    }
    public boolean isEmpty() {
        return head == -1;
    }

}
