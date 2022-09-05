package learning.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class List_method {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tom");//可以重复
        System.out.println(list);
        System.out.println(list.get(3));//支持索引

        //在index=1的位置插入一个元素
        list.add(1,"peter");
        System.out.println(list);
        //indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("peter"));
        //lastIndexOf(Object obj):返回obj在集合中最后出现的位置
        System.out.println(list.lastIndexOf("tom"));
        //Object remove(int index):移除指定index位置的元素并返回此元素
        list.remove(0);
        System.out.println(list);
        //Object set(int index,Object ele):设置指定index位置的元素为ele，相当于替换
        list.set(3,"mike");
        //List subList(int fromIndex,int toIndex):返回fromIndex到toIndex间的子集合
        System.out.println(list.subList(0,2));
        //for()遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
