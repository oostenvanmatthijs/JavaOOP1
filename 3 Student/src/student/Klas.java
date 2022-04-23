package student;

public class Klas {

    private String naam;
    private int aantalStudenten;
    private Student[] studenten;

    public static final int MAX_AANTAL_STUDENTEN = 30;

    public Klas(String naam) {
        this.naam = naam;
        this.aantalStudenten = 0;
        this.studenten = new Student[MAX_AANTAL_STUDENTEN];
    }

    public boolean voegStudentToe(Student s) {
        if (this.aantalStudenten >= this.studenten.length) {
            return false;
        }

        int plekVoorNieuweStudent = this.aantalStudenten;

        this.studenten[plekVoorNieuweStudent] = s;
        this.aantalStudenten++;
        return true;
    }

    public int getAantalStudenten() {
        return this.aantalStudenten;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Klas %s%n", this.naam));
        for (int i = 0; i < this.aantalStudenten; i++) {
            sb.append(this.studenten[i].toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
