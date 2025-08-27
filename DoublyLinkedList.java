package foodtruckmenusystem;

/**
 *
 * @author Sai
 */
import java.util.Iterator;

/**
 * Doubly Linked List implementation
 * @param <E> The type of data stored in the list
 */
public class DoublyLinkedList<E> implements Iterable<E> {
    private DoublyLinkedNode<E> head;
    private DoublyLinkedNode<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Add an element to the end of the list
     * @param data The data to add
     */
    public void add(E data) {
        DoublyLinkedNode<E> newNode = new DoublyLinkedNode<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Remove an element from the list
     * @param data The data to remove
     * @return True if the data was removed, false otherwise
     */
    public boolean remove(E data) {
        DoublyLinkedNode<E> current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Check if the list contains a specific element
     * @param data The data to check
     * @return True if the data exists, false otherwise
     */
    public boolean contains(E data) {
        DoublyLinkedNode<E> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Get the size of the list
     * @return The size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Clear the list
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedListIterator<>(head);
    }
}