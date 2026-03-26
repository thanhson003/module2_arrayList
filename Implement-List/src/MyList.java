import java.util.Arrays;

public class MyList<I extends Number> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }
        private void ensureCapacity() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        public <E> void add(E e) {
            if (size == elements.length) {
                ensureCapacity();
            }
            elements[size++] = e;
        }

        public <E> E get(int i){
            if(i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
            }
            return (E) elements[i];
        }
}
