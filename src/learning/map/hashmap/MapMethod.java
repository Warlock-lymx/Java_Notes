package learning.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "jack");
        map.put(1, "mike");
        map.put(2, "jack");
        map.put(3, "lisa");
        map.put(4, null);
        map.put(null,"henry");
        System.out.println(map);

        //remove:根据键删除映射关系
        map.remove(null);
        System.out.println(map);
        //get:根据键获取值
        System.out.println(map.get(2));
        //size:获取元素个数
        System.out.println(map.size());
        //isEmpty:判断元素个数是否为0
        System.out.println(map.isEmpty());
        //clear:清楚
//        map.clear();
        //containskey:查找键是否存在
        System.out.println(map.containsKey(3));
        //containsvalue:查找值是否存在
        System.out.println(map.containsValue("jack"));
    }
}
