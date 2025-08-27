package foodtruckmenusystem;

/**
 *
 * @author Sai
 */
public class DoublyLinkedNode<E> {
    E data;
    DoublyLinkedNode<E> next;
    DoublyLinkedNode<E> prev;

    /**
     * Constructor to initialize a node with data
     * @param data The data to store in the node
     */
    public DoublyLinkedNode(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
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
}
