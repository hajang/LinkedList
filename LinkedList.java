/**
 * Created by Ha on 16. 1. 1..
 */


public class LinkedList<T> {
    private Node<T> head;

    // 리스트 초기화
    public LinkedList() { head = null; }

    // data로 노드 만들고 head 앞에 추가
    public void addNode(T data){
        Node<T> node = new Node(data);
        node.setNext(head);
        head = node;
    }

    // data 값을 가지는 첫 번째 원소 list 에서 삭제
    public boolean deleteNode(T data){
//        1. data의 앞에 존재하는 노드를 검색
//        2. data의 앞 노드와 뒤 노드를 연결
//        3. data 삭제
//
//        예외) 리스트가 비어있거나 head가 data를 지닐 경우
        if(head == null) return false;
        if(head.getValue() == data){
            head = head.getNext();
            return true;
        }

        Node<T> pre1 = head, pre2 = head.getNext();
        Node<T> node;
        while(pre2 != null && pre2.getValue() != data){
            pre1 = pre2;
            pre2.setNext(pre2.getNext());
        }

        // 리스트에서 data를 찾지 못한 경우
        if(pre2 == null)
            return false;

        // 리스트에서 data를 찾음
        pre1.setNext(pre2.getNext());
        return true;

    }

    // data 값을 가지는 node 반환
    // 반환된 node가 null인지 확인해야 함
    public Node<T> findNode(T data){
        Node<T> node = head;

        while(node != null && node.getValue() != data){
            node = node.getNext();
        }

        return node;
    }

    // currentnode 뒤에 newnode 삽입
    public boolean insertNode(Node<T> currentNode, Node<T> newNode){
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        return true;
    }

    // head를 반환
    public Node<T> getHead(){
        return head;
    }

    // head setter
    public void setHead(Node<T> head){
        this.head = head;
    }

    // 리스트 출력
    public void printList(){
        Node<T> node = head;

        while(node != null){
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }

        System.out.println();
    }



}

