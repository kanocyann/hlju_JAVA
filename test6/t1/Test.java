package test6.t1;

public class Test {
    public static void main(String[] args) {
        boolean boo;
        System.out.println("--------------1--------------");
        LinkedList list = new LinkedList();
        System.out.println(list.size() + " " + list.get(0) + " " + list.search(1) + " " + list.remove(1));
        System.out.println("--------------2--------------");
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println("--------------3--------------");
        Node p = list.search(22);
        System.out.println(p);
        System.out.println("--------------4--------------");
        p = list.search(2);
        System.out.println(p);
        System.out.println("--------------5--------------");
        boo = list.set(null,22);
        System.out.println(boo);
        System.out.println("--------------6--------------");
        list.set(p,22);
        System.out.println(p);
        System.out.println("--------------7--------------");
        boo = list.insertAfter(p,23);
        System.out.println(list.size());
        System.out.println("--------------8--------------");
        boo = list.insertAfter(null,23);
        System.out.println(boo);
        System.out.println("--------------9--------------");
        boo = list.remove(12);
        System.out.println(boo);
        System.out.println("--------------10--------------");
        System.out.println(list.remove(22));
        System.out.println("--------------11--------------");
        p = list.get(0);
        System.out.println(p);
        System.out.println("--------------12--------------");
        p = list.get(-1);
        System.out.println(p);
        System.out.println("--------------13--------------");
        p = list.get(100);
        System.out.println(p);
    }
}