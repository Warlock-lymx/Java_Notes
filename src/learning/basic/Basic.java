package learning.basic;


import java.util.Arrays;

import static java.lang.String.join;

public class Basic {
    public static void main(String[] args) {
        //数学函数
//        int a = (int)sqrt(4);
//        System.out.println(a);

        //静态方法
        String str = join(".","a","b","c");
        System.out.println(str);

        //字符串
        //1.基本数据类型转化为字符串
//        int n = 1;
//        String str = n + "";
        //2.字符串转化为其他类型
//        String s = "123";
//        int n1 = Integer.valueOf(s);
//        double n2 = Double.valueOf(s);
//        char n3 = s.charAt(0);
//        char[] n4 = s.toCharArray();
//        System.out.println(Arrays.toString(n4));

        //遍历字符串
//        int len = "hello".length();
//        for(int i = 0; i < len; i++){
//            System.out.println("hello".substring(i,i+1));
//        }
//        for(int j = 0; j < len; j++){
//            System.out.println("hello".charAt(j));
//        }

        //输入输出
//            Scanner in = new Scanner(System.in);
//            System.out.print("what is your name?\t");
//            String name = in.nextLine();
//            System.out.print("what is your age?\t");
//            int age = in.nextInt();
//            System.out.print("hello, "+name+" ,next year ,your age will be "+(age+1));

        //标准输出当前时间
//            System.out.printf("%tc",new Date_());

//       //命令行参数
//        if(args[0].equals("高晓雯大美女我爱你")){
//            System.out.println("我也爱你");
//        }

        //数组
        int[] a = {0,1,2,3,4,5,6};
        Arrays.fill(a,1);
        String b = Arrays.toString(a);
        System.out.println(b);

        int[] c = Arrays.copyOf(a,9);
        String d = Arrays.toString(c);
        System.out.println(d);

        int[] e = Arrays.copyOfRange(a,2,5);
        String f = Arrays.toString(e);
        System.out.println(f);

        int poi = Arrays.binarySearch(a,1);
        System.out.println(poi);

        /*访问修饰符
        public 同类 同包 子类 不同包 均可访问
        protected 同类 同包 子类 均可访问
                  不同包 不可访问
        默认 同类 同包 均可访问
            子类 不同包不可访问
        private 只有同类可以访问
         */
    }


}
