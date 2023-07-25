package Lesson7.Work2;

public class Main {
    public static void main(String[] args) {

        Printable post1 = new Director();
        post1.print();
        Printable post2 = new Accountant();
        post2.print();
        Printable post3 = new Worker();
        post3.print();
    }
}
