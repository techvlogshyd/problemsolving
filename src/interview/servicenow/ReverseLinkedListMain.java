package interview.servicenow;

import java.util.LinkedList;

class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class ReverseLinedList {
        static Node head;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }

        static void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public class ReverseLinkedListMain{
        public static void main(String[] args) {
            ReverseLinedList linkedList = new ReverseLinedList();

            // Adding elements to the linked list
            linkedList.push(3);
            linkedList.push(7);
            linkedList.push(2);
            linkedList.push(9);

            System.out.println("Original Linked List:");
            linkedList.printList();

            // Reverse the linked list
            linkedList.reverse();

            System.out.println("Reversed Linked List:");
            linkedList.printList();
        }
    }

