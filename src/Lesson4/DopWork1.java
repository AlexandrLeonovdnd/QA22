package Lesson4;
import java.util.Arrays;
import java.util.Scanner;

/*"Одномерные массивы" - ДОП ЗАДАНИЕ 1
Создайте массив из n случайных целых чисел и выведите его на
экран.
Размер массива пусть задается с консоли и размер массива может быть
больше 5 и меньше или равно 10.
Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна
просить пользователя повторить ввод.
Создайте второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран*/
public class DopWork1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = 0;
        while (n < 5 || n > 10) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n < 5 || n > 10) {
                    System.out.print("Введенное число не удовлетворяет условию. Повторите ввод:");
                }
            } else {
                System.out.print("Вы ввели не число. Повторите ввод:");
                in.next();
            }
        }
        int[] arr1 = new int[n];
        int even = 0;

        for (int i = 0; i < n; i++) {
            arr1[i] = (int) (Math.random() * (10));
            if (arr1[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[even];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[index] = arr1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

