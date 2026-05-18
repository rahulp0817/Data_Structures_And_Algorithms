package LinkedList;

public class Add_Two_Numbers {
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

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // If need new list use the dummy list
    ListNode result = new ListNode(0);
    ListNode ptr = result; // ptr point to result 0;

    int carry = 0;

    while (l1 != null || l2 != null) {
      int sum = 0 + carry;

      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      carry = sum / 10; // carry like if 18 then carry 1
      sum = sum % 10; // place 8
      ptr.next = new ListNode(sum); // create a new listnode of the sum
      ptr = ptr.next;
    }

    if (carry == 1) {
      ptr.next = new ListNode(1); // leftover carry; 0 comes in sum but carry as 1 then it used
    }

    return result.next;
  }
}

// Time Complexity: O(max(m, n)), where m and n are the lengths of the two input linked lists.
// Space Complexity: O(max(m, n)), as we are creating a new linked list to