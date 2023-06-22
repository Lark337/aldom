import Method.SLinkedList;

public class Main {
    public static void main(String[] args) {
        SLinkedList<Integer> a  = new SLinkedList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.addFirst(50);
        a.addFirst(60);
        a.getList();
        System.out.println("Размер: " + a.size());
        System.out.println(a.get(5));
        a.reverse();
        a.getList();

    }
    
}
