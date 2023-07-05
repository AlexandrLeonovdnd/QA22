package Lesson2;

import java.util.Scanner;

public class DopWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первоначальную сумму вклада: ");
        float sum = in.nextInt();
        System.out.print("Введите количество месяцев: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + (sum / 100) * 7;
        }
        System.out.println("Конечная сумма вкладов с учетом процентов: " + sum);
    }
}