package learning.exception;

public class Exception1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        //异常处理机制
        //1.如果异常发生了。则异常发生后面的代码不会执行，直接进入到catch块
        //2.如果异常没有发生，则会顺序执行try的代码块，不会进入到catch
        //3.如果希望无论是否发生异常都要执行后面的代码，可以用finally{}
        //4.可以有多个catch语句，捕获不同的异常，陶丘父类异常在后，子类异常在前，如果发生异常，只会匹配一个catch
        try {
            String s = null;
            System.out.println(s.length());

            int res = num1 / num2;
            System.out.println(res);
        } catch (NullPointerException e) {
            System.out.println("空指针异常:" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常:" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常的原因:" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行");
        }

        System.out.println("程序继续运行");
    }
}
