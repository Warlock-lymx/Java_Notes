package learning.OOP_advance.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("梁益铭",4000,"123456");
        System.out.println(account.info());
    }
}
