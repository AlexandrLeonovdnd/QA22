package Lesson4;

import java.util.Scanner;
/* "Одномерные массивыЭ - ЗАДАНИЕ 3
Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.*/

public class Work3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        if (arr.length >= 1) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((int) (Math.random() * 10));
                System.out.print(arr[i] + " ");
            }
            double average = 0;
            if (arr.length > 0) {
                double sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                average = sum / arr.length;
            }
            System.out.println(" ");
            System.out.println("|Среднее значение чисел массива: " + average + "|");
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("|Максимальное число массива: " + max + "|");
            System.out.println("|Минимальное число массива: " + min + "|");
        } else {
            System.out.println("Ошибка ввода размера массива");
        }
    }
}