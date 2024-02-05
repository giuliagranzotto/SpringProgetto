package it.betacom.model;

public class Auto {

    private Motore motore;

    public Auto(Motore motore) {
        super();
        this.motore = motore;
    }

    public void avviaAuto() {
        motore.accendi();
    }

    public Motore getMotore() {
        return motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }


}
