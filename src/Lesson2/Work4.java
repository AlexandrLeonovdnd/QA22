package Lesson2;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int t = in.nextInt();
        if (t > -5) {
            System.out.println("На улице ТЕПЛО");
        } else if (t <= -5 && t > -20) {
            System.out.println("На улице НОРМАЛЬНО");
        } else if (t <= -20) {
            System.out.println("На улице ХОЛОДНО");
        }
    }
}