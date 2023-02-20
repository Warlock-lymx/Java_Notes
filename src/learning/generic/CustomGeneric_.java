package learning.generic;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

//Tiger为自定义泛型类
//T,R,M为反泛型的标识符，一般是单个大写字母
//普通成员可以使用泛型(属性和方法)
//静态方法不能使用泛型，因为在类加载时对象还没创建，泛型是在类创建的时候才确定的
class Tiger<T, R, M> {
    String name;
    T t;
    R r;
    M m;
    //使用泛型的数组不能初始化，因为不能确定要在内存开辟多大空间
    T[] ts;
    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public T getT() {
        return t;
    }
}