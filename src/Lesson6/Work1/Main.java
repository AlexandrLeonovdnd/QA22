package Lesson6.Work1;

class Main extends Phone {
    public static void main(String[] args) {
        Phone ph1 = new Phone(12335, "aios", 10);
        Phone ph2 = new Phone(13335, "redmi10", 25);
        Phone ph3 = new Phone(145678, "x100", 15);
        Phone ph = new Phone();

        ph1.print();
        ph2.print();
        ph3.print();


        System.out.println();
        ph1.receiveCall();
        ph1.getNumber();
        System.out.println();
        ph2.receiveCall();
        ph2.getNumber();
        System.out.println();
        ph3.receiveCall();
        ph3.getNumber();
        System.out.println();
        ph1 = new Phone(ph1.number, ph1.model, ph1.weight);
        ph2 = new Phone(ph2.number, ph2.model);
        ph.receiveCall(ph1.name, ph2.number);
        System.out.println();
        ph.sendMessage(ph1.number, ph2.number);
    }
}
