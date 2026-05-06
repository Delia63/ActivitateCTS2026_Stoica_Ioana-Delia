package STB.ChainOfResponsability.clase.handleriConcreti;

import STB.ChainOfResponsability.clase.CalatorieHandler;

public class CalatorieMetrou extends CalatorieHandler {
    @Override
    public String recomandaCalatorie(double distanta) {
        return "Metrou";
    }
}
