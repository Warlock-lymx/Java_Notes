package learning.collection.list.linkedList;

import java.util.LinkedList;

public class LinkedList_method {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //添加
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        //删除 返回结点的里的元素
        //linkedList.remove();    //默认删除第一个
        linkedList.remove(2);
        System.out.println(linkedList);

        //修改某个结点对象
        linkedList.set(1,999);
        System.out.println(linkedList);

        //得到某个结点对象
        Object o =linkedList.get(1);
        System.out.println(o);
    }
}
