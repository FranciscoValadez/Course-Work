public class SimpleList {
    private Node head = new Node(null, null); // dummy head
    private int size;
    public void addFirst(Object object) {
      head.next = new Node(object, head.next);
      size++;
    }
  
    public void addLast(Object object) { // here I don't need a tail reference
      Node temp = head;
      while(temp.next != null)
        temp = temp.next;
  
     temp.next = new Node(object, null);
     size++;
    }
  
    public Object first() {
      if (size == 0) throw new IllegalStateException("the list is empty");
      return head.next.object;
    }
  
    public boolean isEmpty() {
      return (size == 0);
    }
  
    public Object removeFirst() {
      if (size == 0) throw new IllegalStateException("the list is empty");
  
      Object object = head.next.object;
      head.next = head.next.next;
      size--;
      return object;
    }
  
    public int size() {
      return size;
    }
  
    private static class Node { // the Node class is defined within the SimpleList class
      Object object;
      Node next;
  
      Node(Object object, Node next) {
         this.object = object;
         this.next = next;
      }
    }
  }