public class StringList {
    class Node {
        String input;
        Node next;
        public Node(String in){
            this.input=in;
        }

    }
    Node first;

    public void add(String in) {

        if (first == null) {
            first = new Node(in);
        }

        else {
            Node current = first;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(in);
        }
    }
    public void add(int index, String in){
        Node current = first;
        for(int i=0; i<index-1; i++){
            current = current.next;
        }
        current.next = new Node(in);
    }
    public String get(int index){
        Node current = first;

        for(int i=0; i<index; i++){
            current = current.next;
        }

        return current.input;

    }
    public void remove(int index){
        Node current = first;

        for(int i=0; i<index; i++){
            current=current.next;
        }
        current.input=null;
    }

    public static void main(String[] args) {
        StringList list = new StringList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(2,"d");
        System.out.println(list);
        list.remove(1);
        System.out.println(list.get(2));
    }
}