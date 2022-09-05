package learning.stringbuffer;

public class StringBuffer_ {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("java");

        StringBuffer  a=new StringBuffer("abc");
        a.append("b");

        String b="acd";
        StringBuffer c= new StringBuffer(a);
        c.insert(1,"b");
        System.out.println(b);

        c.deleteCharAt(1);

        StringBuffer d= new StringBuffer("a12345678bcdefgfijklmnopqrstuvwxyz");
        d.delete(1,9);

        d.replace(1,9,"13908862319");

        d.reverse();

        d.substring(5);
        d.substring(1,12);

        System.out.println(d.capacity());
        System.out.println(d.length());


    }
}
