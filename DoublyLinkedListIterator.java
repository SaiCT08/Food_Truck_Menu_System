package foodtruckmenusystem;

/**
 *
 * @author Sai
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterator for Doubly Linked List
 * @param <E> The type of data stored in the list
 */
public class DoublyLinkedListIterator<E> implements Iterator<E> {
    private DoublyLinkedNode<E> current;

    /**
     * Constructor to initialize the iterator
     * @param head The head node of the list
     */
    public DoublyLinkedListIterator(DoublyLinkedNode<E> head) {
        this.current = head;
    }

    /**
     * Checks if there are more elements to iterate over in the list
     * return true if current node is not null, indicating there are more elements. false otherwise
     */
    @Override
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Returns the value of the current node and advances the iterator to the next node
     * returns the value stored in the current node. if there are no more elements, throw NoSuchElementException
     */
    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E data = current.data;
        current = current.next;
        return data;
    }
}
