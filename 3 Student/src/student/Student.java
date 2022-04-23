package student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private int studentnr;
    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;
    private Adres adres;

    public Student(int studentnr, String voornaam, String achternaam, LocalDate geboortedatum, Adres adres) {
        this.studentnr = studentnr;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }

    private String korteGeboortedatum() {
        return this.geboortedatum.format(DateTimeFormatter.ofPattern("dd-mm-yyyy"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d %s %s %s%n", this.studentnr, this.voornaam, this.achternaam, this.korteGeboortedatum()));
        sb.append(String.format("Adres: %s", this.adres.toString()));

        return sb.toString();
    }
}
