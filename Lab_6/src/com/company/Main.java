package com.company;

public class Main {
    public static void main(String[] args) {
        //Zad1
        RachunekBankowy saver1 = new RachunekBankowy(2000.00);
        RachunekBankowy saver2 = new RachunekBankowy(3000.00);

        saver1.setrocznaStopaProcentowa(0.04);
        saver2.setrocznaStopaProcentowa(0.04);

        saver1.obliczMiesieczneOdsetki(saver1.print());
        saver2.obliczMiesieczneOdsetki(saver2.print());

        System.out.println(saver1.print());
        System.out.println(saver2.print());

        saver1.setrocznaStopaProcentowa(0.05);
        saver2.setrocznaStopaProcentowa(0.05);

        saver1.obliczMiesieczneOdsetki(saver1.print());
        saver2.obliczMiesieczneOdsetki(saver2.print());

        System.out.println(saver1.print());
        System.out.println(saver2.print());
    }


//        //Zad2
//        IntegerSet set1 = new IntegerSet();
//        IntegerSet set2 = new IntegerSet();
//        IntegerSet set3 = new IntegerSet();
//        set1.insertElement(44);
//        set1.insertElement(45);
//        set1.insertElement(46);
//
//        set2.insertElement(45);
//        set2.insertElement(46);
//        set2.insertElement(47);
//
//        set3.insertElement(45);
//        set3.insertElement(46);
//        set3.insertElement(47);
//
//        System.out.println(set1);
//        System.out.println(set2);
//
//        set1.deleteElement(45);
//
//        System.out.println(set2);
//
//        System.out.println(IntegerSet.union(set1, set2));
//
//        System.out.println((IntegerSet.intersection(set1, set2)));
//
//        System.out.println(set1.equals(set3));
//        System.out.println(set1.equals(set2));
//    }
}