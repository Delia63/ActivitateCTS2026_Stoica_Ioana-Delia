package Structurale.Facade.hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class Menajera {
    private List<Boolean> camereCurate;

    public Menajera() {
        this.camereCurate = new ArrayList<>();

        for(int i=0; i<6; i++) {
            camereCurate.add(true);
        }

        for(int i=6; i<15; i++) {
            camereCurate.add(false);
        }
    }

    public boolean esteCameraCurata(int codCamera) {
        return camereCurate.get(codCamera);
    }
}
