package learning.CommonClass;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            Register("123", "123123", "363939725@qq.com");
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void Register(String name, String pwd, String email) {
        boolean nameCheck = false;
        boolean pwdCheck = true;
        boolean emailCheck = false;
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            nameCheck = true;
        }
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars.length != 6) {
                pwdCheck = false;
            }
            if (!(Character.isDigit(chars[i]))) {
                pwdCheck = false;
            }
        }
        char[] c = email.toCharArray();
        boolean isAt = false;
        boolean isDot = false;
        for (int j = 0; j < c.length; j++) {
            if (c[j] == '@') {
                isAt = true;
            }
            if (c[j] == '.') {
                isDot = true;
            }
        }
        if (isAt && isDot && (email.indexOf("@") < email.indexOf("."))) {
            emailCheck = true;
        }
        if (!(nameCheck && pwdCheck && emailCheck)) {
            throw new RuntimeException("注册失败");
        }
    }
}
