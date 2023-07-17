package Lesson5.Work2;


import java.sql.SQLOutput;

public class Comp {
    int price;
    String model;
    RAM ram;
    HDD hdd;


    public Comp(int price, String model) {
        this.price = price;
        this.model = model;
         this.ram = new RAM();
        this.hdd = new HDD();

    }


    public Comp(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Comp{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

}
