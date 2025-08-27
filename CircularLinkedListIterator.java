package foodtruckmenusystem;

/**
 *
 * @author Matthew
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularLinkedListIterator<E> implements Iterator<E> {
    private CircularNode<E> current;
    private CircularNode<E> tail;
    private boolean firstIteration = true;

    public CircularLinkedListIterator(CircularNode<E> tail) {
        this.tail = tail;
        this.current = (tail == null) ? null : tail.next;
    }

    @Override
    public boolean hasNext() {
        return current != null && (firstIteration || current != tail.next);
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E data = current.data;
        current = current.next;
        firstIteration = false;
        return data;
    }
}
