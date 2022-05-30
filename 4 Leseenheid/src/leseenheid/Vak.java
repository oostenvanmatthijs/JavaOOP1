package leseenheid;

public class Vak extends LesEenheid {
    private Cijfer cijfer;

    public Vak(String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.cijfer = Cijfer.geenCijfer;
    }

    public Vak(double cijfer, String naam, int ects, int studiejaar){
        this(naam, ects, studiejaar);
        this.cijfer = Cijfer.fromNumber(cijfer);
    }

    public Cijfer getCijfer() { return cijfer; }

    public void setCijfer(double cijfer) { this.cijfer = Cijfer.fromNumber(cijfer); }

    @Override
    public boolean isAfgerond() { return this.cijfer.isVoldoende(); }

    @Override
    public String toString() { return String.format("%s, cijfer %s", super.toString(), this.cijfer); }

}
