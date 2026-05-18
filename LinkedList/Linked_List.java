package LinkedList;

public class Linked_List {
  private ListNode head;
  private int size;

  // Constructor
  Linked_List() {
    this.size = 0;
  }

  class ListNode {
    String data;
    ListNode next;

    ListNode(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // Add First
  public void addFirst(String data) {
    ListNode newNode = new ListNode(data);

    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  // Add Last
  public void addLast(String data) {
    ListNode newNode = new ListNode(data);

    // check the list is empty or not
    if (head == null) {
      head = newNode;
      return;
    }

    ListNode tempNode = head;
    while (tempNode.next != null) {
      tempNode = tempNode.next;
    }

    tempNode.next = newNode;
  }

  // Remove First
  public void removeFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    head = head.next;
  }

  // Remove Last
  public void removeLast() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }

    ListNode secondLastNode = head;
    ListNode lastNode = head.next;

    while (lastNode.next != null) {
      // use two pointer to find the second last node and last node
      secondLastNode = secondLastNode.next;
      lastNode = lastNode.next;
    }

    secondLastNode.next = null;
  }

  // Get Size
  public int getSize() {
    return size;
  }

  // Print List
  public void printList() {
    // check the list is empty or not
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    ListNode tempNode = head;
    while (tempNode != null) {
      System.out.print(tempNode.data + "-> ");
      tempNode = tempNode.next;
    }

    System.out.println("NuLL");
  }

  public static void main(String[] args) {
    Linked_List list = new Linked_List();
    list.addFirst("Hello");
    list.addFirst("World");
    // System.out.println(list.head.data); // Output: World
    // System.out.println(list.head.next.data); // Output: Hello

    list.addLast("!");
    // System.out.println(list.head.next.next.data); // Output: !
    list.printList(); // Output: World -> Hello -> ! -> NULL

    list.removeFirst();
    list.printList(); // Output: Hello -> ! -> NULL

    list.removeLast();
    list.printList(); // Output: Hello -> NULL

    System.out.println(list.getSize());
  }
}
