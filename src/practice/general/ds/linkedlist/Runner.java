package practice.general.ds.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(18);
        linkedList.insert(45);
        linkedList.insert(12);
        linkedList.insertAtStart(25);
        linkedList.insertAt(2, 55);
        linkedList.insertAt(0, 65);
        linkedList.show();;
        linkedList.deleteAt(2);
        System.out.println("After delete***");
        linkedList.show();;

    }


}
