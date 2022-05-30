package leseenheid;

public class Cijfer {
    private Double cijfer;
    private static final double MINIMUM_VOLDOENDE = 5.5;

    private Cijfer(Double cijfer){ this.cijfer = cijfer; }

    public double getValue() { return this.cijfer; }

    public boolean isVoldoende() {
        if (this.cijfer == null) {
            return false;
        }
        return this.cijfer >= MINIMUM_VOLDOENDE;
    }

    @Override
    public String toString() {
        if(this.cijfer == null){
            return "-";
        }

        double cijferTotHonderd = this.cijfer * 10;
        double floored = Math.floor(cijferTotHonderd);

        return String.format("%.1f", floored/10);
    }

    public static final Cijfer geenCijfer = new Cijfer(null);

    public static Cijfer fromNumber(double cijfer){
        if(cijfer >= 0 && cijfer <= 10){
            return new Cijfer(cijfer);
        }else{
            return geenCijfer;
        }
    }


}
