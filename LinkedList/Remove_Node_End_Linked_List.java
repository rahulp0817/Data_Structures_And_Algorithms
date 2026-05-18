package LinkedList;

public class Remove_Node_End_Linked_List {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode slow = dummy;
    ListNode fast = dummy;

    // Move fast pointer n+1 steps
    for (int i = 0; i <= n; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    // Delete node
    slow.next = slow.next.next;

    return dummy.next;
  }
}

// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(1), as we are using only a constant amount of extra space for the dummy node and pointers.
