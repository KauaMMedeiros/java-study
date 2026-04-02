public class Main {

    static void main(String[] args){

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("\nCurrent job pages: %d, printer total: %d", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("\nCurrent job pages: %d, printer total: %d", pagesPrinted, printer.getPagesPrinted());

        Printer printer1 = new Printer(50, false);
        System.out.println("\n\nInitial page count = " + printer1.getPagesPrinted());

        pagesPrinted = printer1.printPages(5);
        System.out.printf("\nCurrent job pages: %d, printer total: %d", pagesPrinted, printer1.getPagesPrinted());

        pagesPrinted = printer1.printPages(10);
        System.out.printf("\nCurrent job pages: %d, printer total: %d", pagesPrinted, printer1.getPagesPrinted());
    }

}
