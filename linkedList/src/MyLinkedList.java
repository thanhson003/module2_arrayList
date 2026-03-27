public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes;


    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }


    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Vị trí index không hợp lệ: " + index);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Vị trí index không hợp lệ: " + index);
        }

        if (index == 0) {
            E data = (E) head.getData();
            head = head.next;
            numNodes--;
            return data;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        E data = (E) temp.next.getData();
        temp.next = temp.next.next;
        numNodes--;
        return data;
    }

    public boolean remove(Object e) {
        if (head == null) return false;

        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.getData().equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    @Override
    public Object clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            cloneList.addLast((E) temp.getData());
            temp = temp.next;
        }
        return cloneList;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((o == null && temp.getData() == null) || (o != null && o.equals(temp.getData()))) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Vị trí index không hợp lệ: " + i);
        }
        Node temp = head;
        for (int k = 0; k < i; k++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        if (head == null) return null;
        return (E) head.getData();
    }

    public E getLast() {
        if (head == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}