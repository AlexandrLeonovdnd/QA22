package Lesson4;

import java.util.Arrays;

/* "Одномерные массивы" - ДОП ЗАДАНИЕ 3
Создайте массив строк. Заполните его произвольными именами
людей.
Отсортируйте массив.
Результат выведите на консол*/
public class DopWork3 {
    public static void main(String[] args){
        String[] arr = { "Gleb", "Alex", "Serg", "Bor" };
        Arrays.sort (arr);
        System.out.println(Arrays.toString(arr));
    }
}
