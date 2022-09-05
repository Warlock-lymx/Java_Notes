package learning.OOP_advance.extend;

public class Test {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "jack";
        pupil.age = 9;
        pupil.testing();
        pupil.setScore(100);
        pupil.info();

        Graduate graduate = new Graduate();
        graduate.name = "peter";
        graduate.age = 18;
        graduate.testing();
        graduate.setScore(100);
        graduate.info();
    }
}
