package bsamonitor;

import java.util.Arrays;

public class VakkenPakket {

    private Vak[] vakken;

    public VakkenPakket() {
        this.vakken = new Vak[0];
    }

    public Vak[] getVakken() {
        return Arrays.copyOf(this.vakken, this.vakken.length);
    }

    public void addVak(Vak vak) {
        this.vakken = Arrays.copyOf(this.vakken, this.vakken.length + 1);
        this.vakken[this.vakken.length - 1] = vak;
    }

    public int getBeschikbareEcts() {
        int ects = 0;
        for(Vak vak : this.vakken) {
            ects += vak.getEcts();
        }
        return ects;
    }

    public int getBehaaldeEcts(){
        int ects = 0;
        for(Vak vak : this.vakken){
            ects += vak.gehaaldeEcts();
        }
        return ects;
    }
}
