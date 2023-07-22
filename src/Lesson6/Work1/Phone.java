package Lesson6.Work1;

import java.util.Scanner;

public class Phone {
    int number;
    String model;
    int weight;
    String name = "Alex";

    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "\n" + number);
    }

    public void getNumber() {
        System.out.println(number);
    }

    public void sendMessage(int num1, int num2) {
        System.out.println(num1 + "\n" + num2);
    }

    public Phone(int number, String model, int weight) {

        this.number = number;
        this.model = model;
        this.weight = weight;
         Phone ph = new Phone();
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;

    }

    public Phone() {
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';

    }

}
