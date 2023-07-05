package Lesson2;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        String num = scanner.next();
                switch (num) {
            case "12", "1", "2":
                System.out.println("Пора года: Зима");
                break;
            case "3", "4", "5":
                System.out.println("Пора года: Весна");
                break;
            case "6", "7", "8":
                System.out.println("Пора года: Лето");
                break;
            case "9", "10", "11":
                System.out.println("Пора года: осень");
                break;
            default:
                System.out.println("Неверно введён номер месяца!!");
        }

    }
}
