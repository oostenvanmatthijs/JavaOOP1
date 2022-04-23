package bsamonitor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Matthijs van Oosten");

        VakkenPakket pakket = new VakkenPakket();
        BSAMonitor monitor = new BSAMonitor(pakket);

        pakket.addVak(new Vak("Enjoy your Flight", 12));
        pakket.addVak(new Vak("Essential Skills", 4));
        pakket.addVak(new Vak("Professional Development", 8));
        pakket.addVak(new Vak("Business & IT", 4));
        pakket.addVak(new Vak("Data modelling & Databases", 3));
        pakket.addVak(new Vak("Programming", 3));
        pakket.addVak(new Vak("Design & Development", 5));
        pakket.addVak(new Vak("Infrastructure", 3));
        pakket.addVak(new Vak("OOP1", 3));
        pakket.addVak(new Vak("Databases 2", 3));
        pakket.addVak(new Vak("OOP2", 3));
        pakket.addVak(new Vak("Testing", 3));
        pakket.addVak(new Vak("Professional Development 2", 6));

        monitor.vraagCijfers();
        monitor.printOverzicht();
        monitor.printAdvies();

    }
}
