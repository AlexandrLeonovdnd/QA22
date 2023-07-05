package Lesson4;

import java.util.Scanner;

/* "Многомерные массивы" - ЗАДАНИЕ 1
Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
задается из консоли
 */
public class Work2D1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int up = in.nextInt();
        System.out.println("Первоначальный массив");
        int[][][] arr = {{{1, 2}, {3, 4}}, {{5, 6, 7}, {8, 9, 10}}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int f = 0; f < arr[i][j].length; f++) {
                    System.out.print(arr[i][j][f] + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println("Увеличенный массив");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int f = 0; f < arr[i][j].length; f++) {
                    System.out.print(arr[i][j][f] + up + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
