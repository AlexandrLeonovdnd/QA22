package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

/* "Одномерные массивыЭ - ЗАДАНИЕ 2
Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.*/

public class Work2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int[] arr = {3, 1, 6, 5, 2, 8, 4};
        int[] newArr = null;
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }
        }
        if (newArr == null) {
            System.out.println("ОШИБКА. Заданного числа нет в массиве");
        } else System.out.println("Новый массив после удаления числа: " + Arrays.toString(newArr));
    }
}

