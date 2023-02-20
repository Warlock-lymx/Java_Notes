package learning.generic;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IUsb<U, R> {
    //静态成员不能使用泛型
    int n = 10;

    R get(U u);

    void hi(R r);
}

//继承接口时要指定泛型的类型
interface IA extends IUsb<String,Double>{

}

class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }
}

//实现接口时要指定泛型的类型
class BB implements IUsb<Integer,Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }
}

//没有指定类型默认为Object
class CC implements IUsb{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }
}