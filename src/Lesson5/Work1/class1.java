package Lesson5.Work1;

class CreditCard {
    String aсс1, acc2, acc3;
    int sum1, sum2, sum3;

    void sumup1(int up1, int down1) {
        sum1 = sum1 + up1 - down1;
        System.out.println("Номер счета " + aсс1 + "| Сумма на счету " + sum1);
    }

    void sumup2(int up2, int down2) {
        sum2 = sum2 + up2 - down2;
        System.out.println("Номер счета " + acc2 + "| Сумма на счету " + sum2);
    }

    void sumup3(int up3, int down3) {
        sum3 = sum3 + up3 - down3;
        System.out.println("Номер счета " + acc3 + "| Сумма на счету " + sum3);
    }
}
