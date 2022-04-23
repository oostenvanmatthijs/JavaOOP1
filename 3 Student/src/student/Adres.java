package student;

public class Adres {
    private String straat;
    private int huisnr;
    private String postcode;
    private String plaats;

    public Adres(String straat, int huisnr, String postcode, String plaats) {
        this.straat = straat;
        this.huisnr = huisnr;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    public String toString() {
        return String.format("%s %d, $s $s", this.straat, this.huisnr, this.postcode, this.plaats);
    }

    //Functie die controleert of postcode geldig is
    public static boolean checkPostcode(String postcode) {
        if (postcode == null || postcode.length() != 6) {
            return false;
        }

        boolean geldig = true;
        for (int i = 0; i < 4; i++) {
            geldig &= (postcode.charAt(i) >= '0') && (postcode.charAt(i) <= '9');
        }

        for (int i = 4; i < 6; i++) {
            geldig &= (postcode.charAt(i) >= 'A') && (postcode.charAt(i) <= 'Z');
        }

        return geldig;

    }
}
