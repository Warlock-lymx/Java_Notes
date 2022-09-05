package learning.arithmetic;

public class HannuoTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(6, 'a', 'b', 'c');
    }
}

class Tower {
    //把所有盘子借助b从a移动到c
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //把除了最下方的所有盘子借助c从a移动到b
            move(num - 1, a, c, b);
            //把a最下方的盘子从a移动到c
            System.out.println(a + "->" + c);
            //把所有盘子借助a从b移动到c
            move(num - 1, b, a, c);
        }
    }
}
