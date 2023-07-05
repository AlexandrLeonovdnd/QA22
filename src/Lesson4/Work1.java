package Lesson4;


import java.util.Scanner;

/*"Одномерные массивы" - ЗАДАНИЕ 1
Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner)*/

public class Work1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        boolean res = false;
        for (int i : arr) {
            if (num == i) {
                res = true;
                System.out.println("Число входит в массив");
                break;
            }
        }
        if (!res) {
            System.out.println("Число не входит в массив");
        }
    }
}





