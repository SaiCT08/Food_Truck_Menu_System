package foodtruckmenusystem;

/**
 *
 * @author Matthew
 */
import java.util.Collection;
import java.util.Iterator;

public class CircularLinkedList<E> implements Collection<E> {
    private CircularNode<E> tail;
    private int size;

    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean add(E e) {
        CircularNode<E> newNode = new CircularNode<>(e);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (tail == null) return false;

        CircularNode<E> current = tail;
        CircularNode<E> prev = null;

        do {
            if (current.data.equals(o)) {
                if (prev == null) {
                    tail = null; // Removing the only element
                } else {
                    prev.next = current.next;
                    if (current == tail) tail = prev;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != tail);

        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (tail == null) return false;

        CircularNode<E> current = tail.next;
        do {
            if (current.data.equals(o)) return true;
            current = current.next;
        } while (current != tail.next);

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new CircularLinkedListIterator<>(tail);
    }

    @Override
    public int size() {
        return size;
    }

    // Remaining methods (clear, addAll, retainAll, etc.) follow the same logic as the combined implementation.

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        tail = null;
        size = 0;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) return false;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean changed = false;
        for (Object item : c) {
            changed |= remove(item);
        }
        return changed;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean changed = false;
        CircularNode<E> current = tail.next;
        do {
            if (!c.contains(current.data)) {
                remove(current.data);
                changed = true;
            }
            current = current.next;
        } while (current != tail.next);
        return changed;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (E item : this) {
            array[index++] = item;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int index = 0;
        for (E item : this) {
            if (index < a.length) {
                a[index++] = (T) item;
            } else {
                break;
            }
        }
        return a;
    }
}

