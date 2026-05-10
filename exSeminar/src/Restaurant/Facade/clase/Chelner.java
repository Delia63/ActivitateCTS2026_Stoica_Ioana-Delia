package Restaurant.Facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Chelner {
    private List<Boolean> meseCurate;
    private List<Boolean> meseCuServetele;

    public Chelner() {
        this.meseCurate = new ArrayList<>();
        this.meseCuServetele = new ArrayList<>();

        for(int i=0; i<16; i++) {
            if(i<6) {
                meseCurate.add(true);
            }
            else {
                meseCurate.add(false);
            }
        }

        for(int i=0; i<16; i++) {
            if(i<4) {
                meseCuServetele.add(false);
            }
            else {
                meseCuServetele.add(true);
            }
        }
    }

    public boolean esteMasaCurata(int nrMasa) {
        return meseCurate.get(nrMasa);
    }

    public boolean areMasaServetele(int nrMasa) {
        return meseCuServetele.get(nrMasa);
    }
}
