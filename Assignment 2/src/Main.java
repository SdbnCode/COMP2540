public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //adding elements to linked list
        list.addFirst("!");
        list.addFirst("world ");
        list.addFirst("Hello ");
        System.out.print("Current Head: ");
        System.out.println(list.getFirst());

        //removing at the head (should delete Hello and print world
        list.removeFirst();
        System.out.print("Head after using removing head function: ");
        System.out.println(list.getFirst());

        //add element to the tail
        list.addLast("LAST");
        System.out.print("Last element: ");
        System.out.println(list.getLast());

        //remove last element
//        list.removeLast();
        System.out.print("Last after using removing last function: ");
        System.out.println(list.getLast());
    }
}