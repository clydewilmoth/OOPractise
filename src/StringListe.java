public class StringListe {

    Node first;

    public void add(String i) {

        if (first == null) {
            first = new Node(i);
            return;
        }

        Node current = first;

        while(current.next!=null){
            current=current.next;
        }

        current.next = new Node(i);

    }

    public String get(int index){
        Node current = first;

        for(int i=0; i<index; i++){
            current = current.next;
        }

        return current.x;

    }

    public static void main(String[] args) {

        StringListe liste = new StringListe();
        liste.add("penis");
        liste.add("enes");
        liste.add("8==D");
        liste.add("8========D");
        liste.add("-_-_-_-_-_-");
        System.out.println(liste.get(3));

    }


}
