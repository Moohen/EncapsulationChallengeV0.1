package com.mateusz;

public class Printer {

    // magic is tonerLevel
    private int magic;
    // spell is numberOfPagesPrinted
    private int spell;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        this.magic = tonerLevel;
        this.spell = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillUpTheToner(int fillUp) {
        if(this.magic + fillUp > 100) {
            System.out.println("You added too much toner");
        } else if(magic + fillUp <= -1) {
            System.out.println("Toner level is too low");
        } else {
            return this.magic = this.magic + fillUp;
        }
        return -1;
    }

    public int printingPages(int printing) {
        return this.spell = this.spell + printing;
    }

    public int getMagic() {
        return magic;
    }

    public int getSpell() {
        return spell;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
