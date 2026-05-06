package Strategy.clase;

import Strategy.clase.strategii.Grila;
import Strategy.clase.strategii.ModSustinere;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(String nume, ModSustinere modSustinere) {
        this.nume = nume;
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere = new Grila();
    }

    public ModSustinere getModSustinere() {
        return modSustinere;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare() {
        modSustinere.sustinereExamen();
    }
}
