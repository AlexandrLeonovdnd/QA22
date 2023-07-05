package Lesson4;

/* "Одномерные массивы" - ДОП ЗАДАНИЕ 2
Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке*/

public class DopWork2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
}