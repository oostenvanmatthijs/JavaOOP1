package student;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static String vraag(Scanner input, String onderwerp, int huidigeStudent){
        System.out.println(String.format("Wat is %s van student %d?", onderwerp, huidigeStudent));
        return input.nextLine();
    }

    private static LocalDate vraagGeboortedatum(Scanner input, int huidigeStudent) {
        String rauweDatum = vraag(input, "de geboortedatum (bijv. 01-01-1996", huidigeStudent);
        String[] partsDate = rauweDatum.split("-");
        return LocalDate.of(Integer.parseInt(partsDate[2]), Integer.parseInt(partsDate[1]), Integer.parseInt(partsDate[0]));
    }

    private static String vraagPostcode(Scanner input, int huidigeStudent){
        boolean geldigePostcode = false;
        String postcode = null;
        while(!geldigePostcode){
            postcode = vraag(input, "de postcode", huidigeStudent);
            geldigePostcode = Adres.checkPostcode(postcode);
            if(!geldigePostcode){
                System.out.println("Ongeldige postcode, probeer het opnieuw (bijvoorbeeld 1434AC");
            }
        }

        return postcode;
    }

    private static Student vraagStudent(Scanner input, int studentnr, int huidigeStudent){
        String voornaam = vraag(input, "de voornaam", huidigeStudent);
        String achternaam = vraag(input, "de achternaam", huidigeStudent);
        LocalDate geboortedatum = vraagGeboortedatum(input, huidigeStudent);

        String straat = vraag(input, "de straat", huidigeStudent);
        int huisnummer = Integer.parseInt(vraag(input, "het huisnummer", huidigeStudent));
        String stad = vraag(input, "de stad", huidigeStudent);
        String postcode = vraagPostcode(input, huidigeStudent);

        Adres adres = new Adres(straat, huisnummer, stad, postcode);
        return new Student(studentnr, voornaam, achternaam, geboortedatum, adres);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Wat is de naam van de klas?");
        String naam = input.nextLine();

        Klas klas = new Klas(naam);

        while(true){
            int huidigeStudent = klas.getAantalStudenten() + 1;
            if(huidigeStudent > Klas.MAX_AANTAL_STUDENTEN) {
                break;
            }

            int studentnr = Integer.parseInt(vraag(input, "het studentnummer", huidigeStudent));
            if (studentnr == 0) {
                break;
            }

            Student student = vraagStudent(input, studentnr, huidigeStudent);
            klas.voegStudentToe(student);
        }

        System.out.println(klas.toString());
    }



}
