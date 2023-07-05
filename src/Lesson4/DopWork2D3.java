package Lesson4;

/* "Многомерные массивы" - ДОП ЗАДАНИЕ 3
Создайте двумерный массив. Выведите на консоль диагонали массива
 */
public class DopWork2D3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        System.out.println("Диагонали двумерного массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

