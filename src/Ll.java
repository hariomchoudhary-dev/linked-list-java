public class Ll {
    Node head;
    int size;
    public  class Node{
        int val;
        Node next ;

        Node(int val, Node next){
            this.val = val;
            this.next = next;

        }

        }
         void add(int val) {
        Node node = new Node(val,null);
        Node iterator=head;

        if(head==null) {
            head = node;
            size++;
            return;
        }

        while (iterator.next!=null ) {
            iterator = iterator.next;

        }
        iterator.next = node;
        size++;
        }



    void display(){
        Node iterator = head;
          while (iterator != null){
              System.out.print(iterator.val + "--> ");
              iterator = iterator.next;
          }
        System.out.println("null");
    }

    void deleteLast(){
        Node iterator = head;
        if (iterator.next!= null){
        while (iterator.next.next!= null ){
            iterator = iterator.next;
        }
        iterator.next = null;
    } else head= null;
}

    void insert(int predecessor, int inserted) {

        Node iterator = head;
        if (iterator.next!= null) {
            while (iterator.next.val == predecessor) {
                iterator = iterator.next;
            }
            Node given = new Node(inserted, iterator.next);
            iterator.next = given;
        }
    }
}
