public class Main {
    public static void main(String[] args) {

        Heap heapTree = new Heap(15);
        //size = 10
        heapTree.insert(10);
        heapTree.insert(9);
        heapTree.insert(8);
        heapTree.insert(7);
        heapTree.insert(6);
        heapTree.insert(5);
        heapTree.insert(4);
        heapTree.insert(3);
        heapTree.insert(2);
        heapTree.insert(1);


        //Test removeMin
        heapTree.removeMin();
        heapTree.print();
    }
}
