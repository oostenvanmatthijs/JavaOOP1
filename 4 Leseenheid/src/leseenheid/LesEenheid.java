package leseenheid;

public abstract class LesEenheid {
    private String naam;
    private int ects;
    private int studieJaar;

    public LesEenheid(String naam, int ects, int studieJaar) {
        this.naam = naam;
        this.ects = ects;
        this.studieJaar = studieJaar;
    }

    public String getNaam() {
        return naam;
    }

    public int getEcts() {return ects;}

    public int getStudiejaar() {
        return studieJaar;
    }

    public abstract boolean isAfgerond();

    @Override
    public String toString() {
        return String.format("%s, %d ects, studiejaar %d", this.naam, this.ects, this.studieJaar);
    }
}
