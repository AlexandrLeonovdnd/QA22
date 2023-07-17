package Lesson5.Work1;

import Lesson5.Work1.CreditCard;

public class Main1 {
    public static void main(String[] args) {
        CreditCard cart1 = new CreditCard ();
        cart1.aсс1 = "123456789";               //Номер первого счета
        cart1.sum1 = 10000;                     //Начальная сумма на первом счете
        cart1.sumup1(256, 0);
        CreditCard cart2 = new CreditCard ();
        cart2.acc2 = "13631128";                //Номер второго счета
        cart2.sum2 = 10000;                     //Начальная сумма на втором счете
        cart2.sumup2(1043, 0);
        CreditCard cart3 = new CreditCard ();
        cart3.acc3 = "123456789";               //Номер третьего счета
        cart3.sum3 = 10000;                     //Начальная сумма на третьем счете
        cart3.sumup3(0, 999);
    }
}
