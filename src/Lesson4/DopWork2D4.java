package Lesson4;

/* "Многомерные массивы" - ДОП ЗАДАНИЕ 4
Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
двумерного массива по возрастанию
 */
public class DopWork2D4 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        System.out.println("Двумерный массив случайных чисел");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("________");
        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i][j] > a[i][k]) {
                        b = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = b;
                    }
                }
            }
        }
        System.out.println("Отсортированный массив по возрастанию");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
