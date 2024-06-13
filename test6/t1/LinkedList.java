package test6.t1;

public class LinkedList {
    private Node head;

    //将值为data的节点插入到链表尾
    public void add(Object date) {
        Node node = new Node(date);//创建包含data值的Node节点
        if (head == null) {//链表为空，则当前节点就是第一个节点
            head = node;
        } else { //链表不为空，需要找到最后一个节点
            Node temp = head; //利用tmp节点遍历
            while (temp.getNext() != null) {//tmp节点不是最后一个节点
                temp = temp.getNext(); //tmp指向下一个节点
                //循环结束时tmp为最后一个节点
            }
            temp.setNext(node);//把当前节点链接在最后一个节点之后
        }
    }

    public Node head() {
        return head;
    }

    //在链表中删除值为data的节点。若删除成功，返回true；否则，返回false
    public boolean remove(Object date) {
        if (date != null) {
            Node temp = head;
            Node node = head;
            if (temp == null) {
                return false;
            }
            while (temp != null) {
                if (temp.getDate().equals(date)) {
                    if (temp == head) {
                        head = head.getNext();
                        return true;
                    }
                    node.setNext(temp.getNext());
                    return true;
                }
                node = temp;
                temp = temp.getNext();
            }
            return false;
        }
        return false;
    }

    //在链表中查找值为data的节点。若找到，返回该节点的引用，若没找到，返回null
    public Node search(Object date) {
        Node temp = head;
        int i = 0;
        if (head == null) {
            return null;
        } else {
            while (temp != null) {
                if (temp.getDate().equals(date)) {
                    i++;
                    break;
                }
                temp = temp.getNext();
            }
            if (i == 0) {
                return null;
            } else {
                return temp;
            }
        }

    }

    //在引用previous指向的节点后插入一个值为data的节点。若插入成功，返回true；否则，返回false
    public boolean insertAfter(Node previous, Object date) {
        Node temp = head;
        Node temp2;
        Node temp3;
        int i = 0;
        if (head == null) {
            return false;
        } else {
            while (temp.getNext() != null) {
                if (temp.equals(previous)) {
                    temp2 = temp.getNext();
                    temp3 = new Node(date);
                    temp3.setNext(temp2);
                    temp.setNext(temp3);
                    i++;
                    break;
                }
                temp = temp.getNext();
            }
        }
        if (i == 0) {
            return false;
        } else {
            return true;
        }


    }

    //在链表中找第index个节点。若找到，返回第index节点的引用，若找不到，返回null
    public Node get(int index) {
        if (head == null) {
            return null;
        } else {
            int i = 0;
            Node temp = head;
            while (temp.getNext() != null) {
                if (i == index) {
                    return temp;
                }
                i++;
                temp = temp.getNext();
            }
            if (i == index) {
                return temp;
            }
            return null;
        }
    }

    //将node引用节点的内容改为data。若修改成功，返回true；否则，返回false
    public boolean set(Node node, Object date) {
        Node temp = head;
        if (head == null) {
            return false;
        } else {
            int f = 0;
            while (temp != null) {
                if (temp.equals(node)) {
                    temp.setDate(date);
                    f++;
                    break;
                }
                temp = temp.getNext();
            }
            if (f == 0) return false;
            else return true;
        }
    }

    //返回链表长度
    public int size() {
        Node node = head;
        int i = 0;
        while (node != null) {
            i++;
            node = node.getNext();
        }
        return i;
    }

}