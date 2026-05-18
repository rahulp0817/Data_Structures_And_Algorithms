package LinkedList.Slow_And_Fast_Pointers;

public class Middle_Linked_List {
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {

      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
