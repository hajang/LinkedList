/**
 * Created by Ha on 16. 1. 1..
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) { this.data = data; next = null; }
    public T getValue() { return data; }
    public Node<T> getNext() { return next; }
    public void setValue(T data) { this.data = data; }
    public void setNext(Node<T> next) { this.next = next; }
}
