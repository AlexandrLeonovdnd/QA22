package Lesson5.Work2;

import Lesson5.Work2.Comp;

public class Main2 {
    public static void main(String[] args) {
        Comp comp1 = new Comp (20000, "PX200");
        comp1.print();
        RAM ram = new RAM("King", 16);
        HDD hdd = new HDD("Kingsston", "внешний", 1000);
        Comp comp2 = new Comp(2000,"Asus", ram, hdd);
        comp2.print();
    }
}
