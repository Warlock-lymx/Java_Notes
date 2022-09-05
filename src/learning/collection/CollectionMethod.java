package learning.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //add:添加单个元素
        list.add(10);
        list.add("abc");
        list.add(true);
        System.out.println(list);

        //remove:删除指定元素
//        list.remove(0);//删除第一个元素
//        list.remove("abc");
//        System.out.println(list);

        //contains:查找元素是否存在
        System.out.println(list.contains("abc"));

        //size:获取元素个数
        System.out.println(list.size());

        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());

        //clear:清空
//        list.clear();
//        System.out.println(list);

        //addAll:添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list.addAll(1,list2);
        System.out.println(list);

        //containsAll:查找多个元素是否同时存在
        System.out.println(list.containsAll(list2));

        //removeAll:删除多个元素
        list.removeAll(list2);
        System.out.println(list);

        //Iterator
        Collection col = new ArrayList();
        col.add(1);
        col.add(2);
        col.add(3);

        //得到col对应的迭代器
        Iterator iterator = col.iterator();
        //itit快捷键
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        //如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();

        //增强for循环
        for(Object i : col) {
            System.out.println(i);
        }

    }


}
