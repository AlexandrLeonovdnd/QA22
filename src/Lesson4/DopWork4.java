package Lesson4;

import java.util.Arrays;

/* "Одномерные массивы" - ДОП ЗАДАНИЕ 4
Реализуйте алгоритм сортировки (любой, кроме пузырька)
Функция для выполнения сортировки вставками для `arr[]`
 */
public class DopWork4 {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > value) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 4, 1, 9, -2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}