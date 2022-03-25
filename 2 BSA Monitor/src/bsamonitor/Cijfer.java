package bsamonitor;

public class Cijfer {

    public static final double voldoende = 5.5;
    private double waarde;

    private Cijfer(double waarde) {
        this.waarde = waarde;
    }

    public static Cijfer maakCijfer(double cijfer) {
        if (cijfer <= 0 || cijfer > 10) {
            return null;
        } else {
            return new Cijfer(cijfer);
        }
    }

    public boolean isVoldoende() {
        return this.waarde >= voldoende;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.waarde);
    }
 }
