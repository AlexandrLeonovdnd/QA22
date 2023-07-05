package Lesson2;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер: ");
        String num;
        num = scanner.next();
        switch (num) {
            case "1":
                System.out.println("Цвет радуги КРАСНЫЙ");
                break;
            case "2":
                System.out.println("Цвет радуги ОРАНЖЕВЫЙ");
                break;
            case "3":
                System.out.println("Цвет радуги ЖЁЛТЫЙ");
                break;
            case "4":
                System.out.println("Цвет радуги ЗЕЛЁНЫЙ");
                break;
            case "5":
                System.out.println("Цвет радуги ГОЛУБОЙ");
                break;
            case "6":
                System.out.println("Цвет радуги СИНИЙ");
                break;
            case "7":
                System.out.println("Цвет радуги ФИОЛЕТОВЫЙ");
                break;
            default:
                System.out.println("Неверно введён номер цвета!!");
        }

    }
}
