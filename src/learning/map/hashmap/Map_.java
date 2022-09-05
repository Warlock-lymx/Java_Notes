package learning.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_ {
    public static void main(String[] args) {
        //1.Map具有key-value双列元素
        //2.Map中的key不允许重复，value可以重复
        Map map = new HashMap();
        map.put("no1", "jack");
        map.put("no2", "tom");
        map.put("no3", "jack");
        map.put(null, null);
        System.out.println(map);
        //通过get方法，传入一个key，会返回相应的value
        System.out.println(map.get("no1"));

        //entry
        Set set = map.entrySet();
        System.out.println(set);
        for (Object obj : set) {
            //从HashMap$Node里取出k-v
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Set set1 = map.keySet();
        Collection values = map.values();
    }
}
