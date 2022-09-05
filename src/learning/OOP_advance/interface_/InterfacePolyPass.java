package learning.OOP_advance.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //多态传递现象
        //接口类型的变量可以指向实现了该接口的对象实例
        //Teacher实现了IG接口，同时由于继承关系也实现了IH接口
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
}

interface IH {}
interface IG extends IH{}
class Teacher implements IG {}