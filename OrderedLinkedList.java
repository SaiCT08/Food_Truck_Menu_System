package foodtruckmenusystem;

/**
 *
 * @author Matthew
 */
import java.util.Iterator;

public class OrderedLinkedList<T extends Comparable<T>> implements Iterable<T> {
    private OrderedLinkedListNode<T> head;

    /**
     * Adds an element to the ordered linked list, maintaining sorted order.
     * @param value the value to add
     */
    public void add(T value) {
        OrderedLinkedListNode<T> newNode = new OrderedLinkedListNode<>(value);

        if (head == null || value.compareTo(head.getValue()) < 0) {
            newNode.setNext(head);
            head = newNode;
            return;
        }

        OrderedLinkedListNode<T> current = head;
        while (current.getNext() != null && current.getNext().getValue().compareTo(value) < 0) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    /**
     * Checks if the list contains a specific value.
     * @param value the value to check
     * @return true if the value is in the list, false otherwise
     */
    public boolean contains(T value) {
        for (T element : this) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a specific value from the list.
     * @param value the value to remove
     * @return true if the value was removed, false otherwise
     */
    public boolean remove(T value) {
        if (head == null) {
            return false;
        }

        if (head.getValue().equals(value)) {
            head = head.getNext();
            return true;
        }

        OrderedLinkedListNode<T> current = head;
        while (current.getNext() != null && !current.getNext().getValue().equals(value)) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return false;
        }

        current.setNext(current.getNext().getNext());
        return true;
    }
    
    public boolean isEmpty() {
    return head == null; // Check if the list is empty
}
    
    /**
     * Returns an iterator for the linked list.
     * @return an iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new OrderedLinkedListIterator<>(head);
    }
}
