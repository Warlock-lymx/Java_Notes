package learning.OOP_advance.abstract_;

public class BB extends Template{
    public void job() {
        long num = 1;
        for (long i = 1; i < 80000; i++) {
            num *= i;
        }
    }
}
