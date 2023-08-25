package learning.thread.threaduse;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑可用cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
