package foodtruckmenusystem;

/**
 *
 * @author Matthew
 */
/**
 * Node class for a Circular Linked List
 * @param <E> The type of data stored in the node
 */
public class CircularNode<E> {
    E data; // The data stored in this node
    CircularNode<E> next; // Reference to the next node

    /**
     * Constructor to initialize a node with data
     * @param data The data to store in the node
     */
    public CircularNode(E data) {
        this.data = data;
        this.next = null; // Default to null until linked
    }

    /**
     * Get the data stored in the node
     * @return The data of this node
     */
    public E getData() {
        return data;
    }

    /**
     * Set the data of this node
     * @param data The new data for this node
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Get the next node in the list
     * @return The next node
     */
    public CircularNode<E> getNext() {
        return next;
    }

    /**
     * Set the next node in the list
     * @param next The new next node
     */
    public void setNext(CircularNode<E> next) {
        this.next = next;
    }
}

