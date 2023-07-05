package Lesson4;

/* "Многомерные массивы" - ЗАДАНИЕ 2
Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
циклам значения B(Black) или W(White).
 */

public class Work2D2 {
    public static void main(String[] args) {
         int[][] arr = new int [8][8];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++)
                if((i+j)%2==0)
                    System.out.print("W ");
                else
                    System.out.print("B ");
            System.out.println();
        }
    }
}
