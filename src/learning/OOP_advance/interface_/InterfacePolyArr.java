package learning.OOP_advance.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组
        USB[] usbs = new USB[2];
        usbs[0] = new Camera();
        usbs[1] = new Phone();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone) {//运行类型是Phone
                ((Phone) usbs[i]).call();
            }
        }
    }
}

interface USB {
    public void work();
}

class Phone implements USB {
    public void call() {
        System.out.println("call");
    }

    public void work() {
        System.out.println("phone work");
    }
}

class Camera implements USB {
    public void work() {
        System.out.println("camera work");
    }
}