/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruckmenusystem;

/**
 *
 * @author Matthew
 */
public class OrderedLinkedListNode<T> {
    private T value;
    private OrderedLinkedListNode<T> next;

    /**
     * Constructor to create a new node.
     * @param value the value of the node
     */
    public OrderedLinkedListNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public OrderedLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(OrderedLinkedListNode<T> next) {
        this.next = next;
    }
}
