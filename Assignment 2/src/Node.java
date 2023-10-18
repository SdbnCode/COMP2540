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
          Object newElem = element;
    }
    //moving next to newNode
    public void setNext(Node newNext){
        next = newNext;
    }



}
