package STB.ChainOfResponsability.clase.handleriConcreti;

import STB.ChainOfResponsability.clase.CalatorieHandler;

public class CalatorieTramvai extends CalatorieHandler {
    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta >=5 && distanta < 10) {
            return "Tramvai";
        }
        else {
            return super.urmator.recomandaCalatorie(distanta);
        }
    }
}
