package learning.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        //1.set接口的实现类的对象，不能存放重复的元素，可以加入一个null
        //2.set接口对象存放数据是无序的
        //3.set接口对象不能用索引来获取
        Set set = new HashSet();
        set.add("john");
        set.add("jack");
        set.add("lucy");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
