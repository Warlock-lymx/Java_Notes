package learning.map.hashmap;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "jack");
        map.put(1, "mike");
        map.put(2, "jack");
        map.put(3, "lisa");
        map.put(4, null);
        map.put(null, "henry");

        //遍历方法
        //1.先取出所有的key，再通过key取出对应的value
        Set keyset = map.keySet();
        System.out.println(keyset);
        //(1).增强for循环
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2).迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next + "-" + map.get(next));
        }

        //2.把所有的values取出
        Collection values = map.values();
        for(Object value:values) {
            System.out.println(value);
        }

        //3.通过EntrySet来获取k-v
        Set entrySet = map.entrySet();
        //(1).增强for
        for(Object entry : entrySet) {
            //及那个entry转成Map.Entryq
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
