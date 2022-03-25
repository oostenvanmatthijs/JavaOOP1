package bsamonitor;

import java.lang.reflect.Array;
import java.util.*;

public class Vak {
    private String naam;
    private int ects;
    private Cijfer cijfer;

    public Vak(String naam, int ects) {
        this.naam = naam;
        this.ects = ects;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getEcts() {
        return this.ects;
    }

    public Cijfer getCijfer() {
        return this.cijfer;
    }

    public void setCijfer(Cijfer nieuwCijfer){
        this.cijfer = nieuwCijfer;
    }

    public int gehaaldeEcts() {
        if (cijfer != null && cijfer.isVoldoende()) {
            return this.ects;
        }else{
            return 0;
        }
    }
}

