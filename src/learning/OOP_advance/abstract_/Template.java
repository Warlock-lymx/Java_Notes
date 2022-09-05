package learning.OOP_advance.abstract_;

public abstract class Template {
    //模板设计模式
    public abstract void job();

    public void calculate() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "ms");
    }
}
