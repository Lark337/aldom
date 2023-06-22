package Method;


public class  SLinkedList <E>{
    transient Node<E> first ;
    transient Node<E> last;
    transient int size = 0;
    
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
    
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }   
    }

    public SLinkedList() {
        this.first = null;
        this.last = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    public void add(E item ){
        if (size == 0){
            size++;
            this.first = new Node<E>(null, item, null);
            this.last = this.first; 
        }
        else if (size == 1){
            size++;
            this.last = new Node<E>(first, item, null);
            first.next = last;
        }
        else if (size > 1){
            size++;
            last.next = new Node<E>(last, item, null);
            this.last = last.next;
        }
    }

    public void addFirst(E item){
        first.prev = new Node<E>(null, item, first);
        first = first.prev;
        size++;
    }

    public void getList(){
        Node<E> current = first; 
        StringBuilder stroka = new StringBuilder();
        while(current.next != null){
            stroka.append(current.item).append(", ");
            current = current.next;
        }
        stroka.append(current.item);
        System.out.println(stroka);

    }

    public E get(int index){
        if (index < 0 || index >size){
            throw new IllegalArgumentException("Index out of range");
        }
        Node<E> current = first;
        if (index < size / 2){
            for (int i = 0; i < size; i++) {
                if(i == index){
                    return current.item;
                }
                current = current.next;
            }
        }
        else{ 
            current = last;           
            for (int i = size-1; i > 0; i--) {
                if(i == index){
                    return current.item;
                }
                current = current.prev;
            }
        }
        return null;
    }

    public void reverse(){
        Node<E> current = first;
        Node<E> temp = last;
        last = first;
        first = temp;
        while(current != null){
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }
    }
        

    
    
    
}

