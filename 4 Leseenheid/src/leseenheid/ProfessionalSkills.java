package leseenheid;

public class ProfessionalSkills extends LesEenheid {

    private boolean gehaald;

    public ProfessionalSkills(String naam, int ects, int studiejaar) { super(naam, ects, studiejaar);}

    public ProfessionalSkills(boolean gehaald, String naam, int ects, int studiejaar) {
        this(naam, ects, studiejaar);

        this.gehaald = gehaald;
    }

    public boolean isGehaald() { return gehaald; }

    public void setGehaald(boolean gehaald){
        this.gehaald = gehaald;
    }

    @Override
    public boolean isAfgerond() { return this.gehaald; }

    @Override
    public String toString() {
        if(isGehaald()){
            return String.format("%s, gehaald", super.toString());
        }else{
            return String.format("%s, niet gehaald", super.toString());
        }
    }
}
