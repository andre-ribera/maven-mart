package MavenMarketApp;

public class CustomLinkedList<T> {
    //followed along with this article to build customLinkedList
    // https://www.codekru.com/java/make-a-custom-generic-linked-list-in-java#how-to-make-a-generic-linked-list

    private Node head;

    public void add(T element){
        Node node = new Node(element);

        if(this.head == null){
            this.head = node;
        } else {
            Node iterator = this.head;
            while(iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = node;
        }
    }

    public void print(){
        Node iterator = head;
        while(iterator != null){
            System.out.println(iterator.value + " ");
            iterator = iterator.next;
        }
    }

    class Node{
        private T value;
        private Node next;

        private Node(T value){
            this.value = value;
            this.next = null;
        }
    }
}
