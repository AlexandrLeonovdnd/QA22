package Lesson4;
/* "Многомерные массивы" - ДОП ЗАДАНИЕ 1
Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
public class DopWork2D1 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] res = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

