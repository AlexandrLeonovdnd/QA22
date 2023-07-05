package Lesson4;

/* "Многомерные массивы" - ДОП ЗАДАНИЕ 2
Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
элементов массива.
 */
public class DopWork2D2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        System.out.println("Матрица двумерных массивов");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов двумерного массива: " + sum);
    }
}
