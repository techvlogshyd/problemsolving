package practice.general.ds;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Prasanna");
        names.add("Kumar");
        names.add("Modugu");
        System.out.println(names);
        names.add("Prasannakumar");
        System.out.println(names);
        names.add(2,"PrasannaModugu");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
        names.set(0,"Value replaced");
        names.clear();
        System.out.println(names);

        LinkedList<String> namesLinked=new LinkedList<>();
        namesLinked.add("Prasanna");
        namesLinked.add("PrasannaM");
        namesLinked.addLast("Kumar");
        namesLinked.addFirst("Modugu");
        System.out.println(namesLinked);
        namesLinked.remove(1);
        System.out.println(namesLinked);
        namesLinked.removeLast();
        namesLinked.removeFirst();
        System.out.println(namesLinked);
        namesLinked.add("Prasanna");
        namesLinked.add("PrasannaM");
        namesLinked.addLast("Kumar");
        namesLinked.addFirst("Modugu");
        for (String name:namesLinked) {
            System.out.println(name);
        }

        Stack<String> namesStack=new Stack<>();
        namesStack.push("First");
        namesStack.push("Last");
        System.out.println(namesStack);
        namesStack.pop();
        System.out.println(namesStack);

        ArrayDeque<String> namesArrayDequeue=new ArrayDeque<>();
        namesArrayDequeue.push("First");
        namesArrayDequeue.push("Middle");
        namesArrayDequeue.push("Last");
        System.out.println(namesArrayDequeue);
        namesArrayDequeue.pop();
        System.out.println(namesArrayDequeue);

        Deque<Integer> de_que = new ArrayDeque<Integer>(10);
        // Operations 1
        // add() method
        // Adding custom elements
        // using add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        // Iterating using for each loop
        for (Integer element : de_que) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }
        // Operation 2
        // clear() method
        System.out.println("Using clear() ");
        // Clearing all elements using clear() method
        de_que.clear();
        // Operations 3
        // addFirst() method
        // Inserting at the start
        de_que.addFirst(564);
        de_que.addFirst(291);
        // Operation 4
        // addLast() method
        // Inserting at end
        de_que.addLast(24);
        de_que.addLast(14);
        // Display message
        System.out.println(
                "Above elements are removed now");
        // Iterators
        // Display message
        System.out.println(
                "Elements of deque using Iterator :");
        for (Iterator itr = de_que.iterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }
        // descendingIterator()
        // To reverse the deque order
        System.out.println(
                "Elements of deque in reverse order :");
        for (Iterator dItr = de_que.descendingIterator();
             dItr.hasNext();) {
            System.out.println(dItr.next());
        }
        // Operation 5
        // element() method : to get Head element
        System.out.println(
                "\nHead Element using element(): "
                        + de_que.element());
        // Operation 6
        // getFirst() method : to get Head element
        System.out.println("Head Element using getFirst(): "
                + de_que.getFirst());
        // Operation 7
        // getLast() method : to get last element
        System.out.println("Last Element using getLast(): "
                + de_que.getLast());
        // Operation 8
        // toArray() method :
        Object[] arr = de_que.toArray();
        System.out.println("\nArray Size : " + arr.length);
        System.out.print("Array elements : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
        // Operation 9
        // peek() method : to get head
        System.out.println("\nHead element : "
                + de_que.peek());
        // Operation 10
        // poll() method : to get head
        System.out.println("Head element poll : "
                + de_que.poll());
        // Operation 11
        // push() method
        de_que.push(265);
        de_que.push(984);
        de_que.push(2365);
        // Operation 12
        // remove() method : to get head
        System.out.println("Head element remove : "
                + de_que.remove());
        System.out.println("The final array is: " + de_que);
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Prasanna");
        hm.put(2, "Kumar");
        hm.put(3, "Modugu");
        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
