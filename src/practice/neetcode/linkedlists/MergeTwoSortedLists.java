package practice.neetcode.linkedlists;


public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(1);
        ListNode list1Node2 = new ListNode(2);
        ListNode list1Node3 = new ListNode(3);
        ListNode list1Node4 = new ListNode(4);

        ListNode list2Node1 = new ListNode(1);
        ListNode list2Node2 = new ListNode(2);
        ListNode list2Node3 = new ListNode(3);
        ListNode list2Node4 = new ListNode(4);
        ListNode list2Node5 = new ListNode(5);

        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;
        list1Node3.next = list1Node4;

        list2Node1.next = list1Node2;
        list2Node2.next = list1Node3;
        list2Node3.next = list1Node4;
        list2Node4.next = list2Node5;



        ListNode current = list1Node1;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Call the reverseList method to reverse the linked list

        ListNode merged = mergeTwoLists(list1Node1, list2Node1);

        // Print the reversed linked list
        current = merged;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final ListNode root = new ListNode();
        ListNode prev = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return root.next;
    }
}
