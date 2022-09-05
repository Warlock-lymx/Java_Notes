package learning.map.hashtable;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        //键和值都不能为null,否则会抛出异常
        Hashtable table = new Hashtable();
        table.put(null,"aaa");
        table.put("bbb",null);
        System.out.println(table);
    }
}
