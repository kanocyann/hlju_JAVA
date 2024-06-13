package test6.t1;

public class Node {
    Object date;//用于存放节点数据
    Node next;//用于保存本节点的下一节点的引用

    public Node(Object date) {
        this.date = date;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return date + "";
    }
}