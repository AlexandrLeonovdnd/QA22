package Lesson2;

import java.util.Scanner;

public class DopWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов последовательности: ");
        int n = in.nextInt();
        int one = 0;
        System.out.print(one + " ");
        int two = 1;
        System.out.print(two + " ");

        for (int i = 2; i < n; i++) {
            int sum = one + two;
            System.out.print(sum + " ");
            one = two;
            two = sum;
        }
    }
}