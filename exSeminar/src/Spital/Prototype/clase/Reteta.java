package Spital.Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
    private String medicament;
    private Map<String, Double> cantitateSolutii;

    public Reteta(String medicament, Map<String, Double> cantitateSolutii) {
        this.medicament = medicament;
        this.cantitateSolutii = cantitateSolutii;
    }

    private Reteta() {

    }

    @Override
    public IReteta copiaza() {
        Reteta reteta = new Reteta();
        reteta.medicament = this.medicament;
        reteta.cantitateSolutii = new HashMap<>(this.cantitateSolutii);

        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("medicament='").append(medicament).append('\'');
        sb.append(", cantitateSolutii=").append(cantitateSolutii);
        sb.append('}');
        return sb.toString();
    }
}
