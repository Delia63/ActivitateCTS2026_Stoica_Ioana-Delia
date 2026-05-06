package STB.ChainOfResponsability.clase.handleriConcreti;

import STB.ChainOfResponsability.clase.CalatorieHandler;

public class CalatorieTroleibuz extends CalatorieHandler {
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 3) {
            return "Troleibuz";
        }
        else {
            return super.urmator.recomandaCalatorie(distanta);
        }
    }
}
