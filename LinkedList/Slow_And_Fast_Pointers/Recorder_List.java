package LinkedList.Slow_And_Fast_Pointers;

public class Recorder_List {
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public void reorderList(ListNode head) {
    // get the middle element
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // reverse list
    ListNode prev = null;
    ListNode currNode = slow.next;
    slow.next = null; // break the list from middle

    while (currNode != null) {
      ListNode nextNode = currNode.next;
      currNode.next = prev;
      prev = currNode;
      currNode = nextNode;
    }

    // merge list
    ListNode first = head;
    ListNode second = prev;

    while (second != null) {
      ListNode temp1 = first.next;
      ListNode temp2 = second.next;

      first.next = second;
      second.next = temp1;

      first = temp1;
      second = temp2;
    }
  }
}
