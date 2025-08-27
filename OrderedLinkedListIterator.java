package foodtruckmenusystem;

/**
 *
 * @author Matthew
 */

import java.util.Iterator;

public class OrderedLinkedListIterator<T> implements Iterator<T> {
    private OrderedLinkedListNode<T> current;

    /**
     * Constructor to initialize the iterator.
     * @param head the head node of the list
     */
    public OrderedLinkedListIterator(OrderedLinkedListNode<T> head) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }
}