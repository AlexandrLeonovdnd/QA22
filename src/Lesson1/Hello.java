package Lesson1;


import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите своё имя: ");
        String name;
        name = scanner.next();
        System.out.println("Hello " + name);
    }

}
