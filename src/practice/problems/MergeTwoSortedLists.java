package practice.problems;

import java.util.LinkedList;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }
        tail.next = list1 == null ? list2 : list1;

        return head.next;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public static void main(String[] args) {
      LinkedList list1=new LinkedList();
      LinkedList list2=new LinkedList();



//      System.out.println(mergeTwoLists(list1,list2).toString());

    }

}
