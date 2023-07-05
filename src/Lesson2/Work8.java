package Lesson2;

import java.util.Scanner;

public class Work8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}