package Lesson2;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int num = in.nextInt();
        if (num == 12 || num == 1 || num == 2) {
            System.out.println("Пора года: Зима");
        } else if (num == 3 || num == 4 || num == 5) {
            System.out.println("Пора года: Весна");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("Пора года: Лето");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("Пора года: Осень");
        } else if (num > 12) {
            System.out.println("Неверно введен номер месяца");
        }
    }
}