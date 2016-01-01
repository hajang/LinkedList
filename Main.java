/**
 * Created by Ha on 16. 1. 1..
 */
public class Main {

    // main for testing stack
    public static void main(String args[]){
        Stack stack = new Stack();

        stack.push("1");
        stack.push("2");

        print((String)stack.top());

        stack.pop();
        print((String) stack.top());

        stack.pop();

        if(stack.empty())
            print("stack empty");
    }

    // main for testing linkedlist
    public static void list_main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.addNode("0");
        list.addNode("2");

        list.printList();

        Node<String> node = list.findNode("2");
        if(node != null)
            print("node data : " + node.getValue());
        else
            print("node not found");

        list.insertNode(node, new Node<String>("1"));
        list.printList();

        list.deleteNode("2");
        list.printList();
    }

    public static void print(String s){
        System.out.println(s);
    }


}
