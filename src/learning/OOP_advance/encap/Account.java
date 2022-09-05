package learning.OOP_advance.encap;

public class Account {
    private String name;
    private int remain;
    private String password;

    public Account() {
    }

    public Account(String name, int remain, String password) {
        setName(name);
        setPassword(password);
        setRemain(remain);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名格式不符");
        }
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        if (remain > 20) {
            this.remain = remain;
        } else {
            System.out.println("余额格式不符");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码格式不符");
        }
    }

    public String info() {
        return "个人信息为 name:" + name + " remain:" + remain + " password:" + password;
    }
}
