package bsamonitor;

import java.util.Scanner;

public class BSAMonitor {

    private double benodigdRatio;
    private VakkenPakket pakket;

    public BSAMonitor(VakkenPakket pakket){
        this.benodigdRatio = 5d/6d;
        this.pakket = pakket;
    }

    public double getBenodigdRatio(){
        return this.benodigdRatio;
    }

    public void setBenodigdRatio(double newRatio){
        this.benodigdRatio = newRatio;
    }

    public boolean isBsaOk() {
        double behaaldRatio = (double)this.pakket.getBehaaldeEcts() / (double)this.pakket.getBeschikbareEcts();
        return behaaldRatio >= this.benodigdRatio;
    }

    public void printOverzicht() {
        StringBuilder sb = new StringBuilder();

        for(Vak vak: this.pakket.getVakken()) {
            sb.append(String.format("Vak/Project: %s Cijfer: %s ECTS: %d%n", vak.getNaam(), vak.getCijfer(), vak.gehaaldeEcts()));
        }

        sb.append(String.format("Totaal behaalde studiepunten: %d/%d", this.pakket.getBehaaldeEcts(), this.pakket.getBeschikbareEcts()));

        System.out.println(sb);
    }

    public void vraagCijfers() {
        Scanner s = new Scanner(System.in);
        for(Vak vak: this.pakket.getVakken()) {

            Cijfer resultaat = null;

            while(resultaat == null) {
                System.out.println("Wat voor cijfer heb je voor " + vak.getNaam());
                resultaat = Cijfer.maakCijfer(s.nextDouble());
                if(resultaat == null) {
                    System.out.println("Ongeldige invoer voor cijfer (0.0 - 10.0)%n");
                }
            }
            vak.setCijfer(resultaat);
        }
    }

    public void printAdvies() {
        if (!isBsaOk()) {
            System.out.println("Pas op: je ligt op schema voor een negatief BSA");
        }
    }
}
