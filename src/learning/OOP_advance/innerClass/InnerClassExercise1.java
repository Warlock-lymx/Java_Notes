package learning.OOP_advance.innerClass;

public class InnerClassExercise1 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("匿名内部类调用show方法");
            }
        });
    }

    public static void f1(IL il) {
        il.show();
    }
}

interface IL {
    public void show();
}