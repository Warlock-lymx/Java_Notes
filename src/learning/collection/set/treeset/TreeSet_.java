package learning.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("mike");
        treeSet.add("a");
        System.out.println(treeSet);
    }
}
