package Lesson2;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Вводимое число чётное");
        } else {
            System.out.println("Вводимое число нечётное");
        }
    }
}