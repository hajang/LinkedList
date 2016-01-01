/**
 * Created by Ha on 16. 1. 2..
 */
public class Stack<T> {

    private LinkedList<T> list;

    public Stack(){
        list = new LinkedList();
    }

    public void push(T data){
        list.addNode(data);
    }

    public void pop(){
        list.setHead(list.getHead().getNext());
    }

    public T top(){
        if(list.getHead() == null)
            System.out.println("stack is empty");
        return list.getHead().getValue();
    }

    public boolean empty(){
        if(list.getHead() == null)
            return true;
        else
            return false;
    }
}
