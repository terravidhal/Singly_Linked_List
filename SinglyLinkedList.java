public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // Les méthodes SLL vont ici.   Pour commencer, 
    //nous allons vous montrer comment ajouter un nœud à la liste.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
}

