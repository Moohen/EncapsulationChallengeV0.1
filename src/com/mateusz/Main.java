package com.mateusz;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(99, 0, false);

        System.out.println("Toner level is " + printer.getMagic());
        printer.fillUpTheToner(2);
        System.out.println("Toner level is " + printer.getMagic());
        printer.fillUpTheToner(1);
        System.out.println("Toner level is " + printer.getMagic());
        printer.fillUpTheToner(-101);
        System.out.println("Toner level is " + printer.getMagic());

        System.out.println("Printer printed " + printer.getSpell() + " pages");
        printer.printingPages(100);
        System.out.println("Printer printed " + printer.getSpell() + " pages");


    }
}
