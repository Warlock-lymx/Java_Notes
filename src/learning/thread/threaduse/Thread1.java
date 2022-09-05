package learning.thread.threaduse;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
//        cat.run();
        //当main线程启动一个子线程Thread-0，主线程main不会阻塞，会继续执行
        for (int i = 0;i<60;i++) {
            System.out.println("继续执行"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        //主线程结束后进程不会结束，要等所有线程结束后进程才会结束

    }
}

class Cat extends Thread {
    @Override
    public void run() {//重写run，实现业务逻辑
        int times = 0;
        while (true) {
            System.out.println("我是 " + (++times) + " 线程名 " + Thread.currentThread().getName());
            //线程休眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }
    }
}