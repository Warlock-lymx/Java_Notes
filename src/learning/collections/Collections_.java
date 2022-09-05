package learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("peter");
        list.add("li");
        list.add("tom");
        System.out.println(list);

        //reverse(List):反转List中元素的顺序
        Collections.reverse(list);
        System.out.println(list);

        //shuffle(List):对List中元素随机排序
        Collections.shuffle(list);
        System.out.println(list);

        //sort(List):根据元素的自然顺序对List元素按升序排序
        Collections.sort(list);
        System.out.println(list);

        //sort(List,Comparator):根据Comparator产生的顺序对List集合元素排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                return ((String)o1).length() - ((String) o2).length();
            }
        });
        System.out.println(list);

        //swap(List,int,int):指定List中i处的元素和j处的元素进行交换
        Collections.swap(list,1,3);
        System.out.println(list);

        //Object max(Collection):根据元素的自然顺序，返回指令集合中的最大元素
        System.out.println(Collections.max(list));

        //Object max(Collection,Comparator):根据Comparator指定的顺序，返回指令集合中的最大元素
        Object obj = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(obj);

        //Object min(Collection):根据元素的自然顺序，返回指令集合中的最小元素
        //Object min(Collection,Comparator):根据Comparator指定的顺序，返回指令集合中的最小元素

        //int frequency(Collection,Object):返回指定元素的出现次数
        System.out.println(Collections.frequency(list,"tom"));

        //void copy(List dest,List src):将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完整拷贝，需要先给dest赋值，使其大小和src相同或大于
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println(dest);

        //boolean replaceAll(List list,Object oldV,Object newV):使用新值替换List中的所有旧值
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);

    }
}
