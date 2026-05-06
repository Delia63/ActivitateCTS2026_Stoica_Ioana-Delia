package STB.ChainOfResponsability.clase.handleriConcreti;

import STB.ChainOfResponsability.clase.CalatorieHandler;

public class CalatorieAutobuz extends CalatorieHandler {
    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta >=3 && distanta < 5) {
            return "Autobuz";
        }
        else {
            return super.urmator.recomandaCalatorie(distanta);
        }
    }
}
