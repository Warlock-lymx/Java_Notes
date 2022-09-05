package learning.OOP_advance.codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie = new Movie("肖申克的救赎");
        Movie movie1 = new Movie("绿皮书", 100);
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //不管哪个构造器创建对象都会调用代码块的内容
    //代码块的顺序优先于构造器
    {
        System.out.println("电影开始");
        System.out.println("广告开始");
        System.out.println("正式开始");
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}