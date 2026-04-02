package test13.SimpleFactory.fabrica;

import test13.SimpleFactory.clase.Cardiologie;
import test13.SimpleFactory.clase.Gastroenterologie;
import test13.SimpleFactory.clase.IInternare;
import test13.SimpleFactory.clase.Neurologie;

public class InternareFactory {
    public IInternare getInternare(TipInternare tipInternare) {
        return switch (tipInternare) {
            case Cardiologie -> new Cardiologie();
            case Neurologie -> new Neurologie();
            case Gastroenterologie -> new Gastroenterologie();
            default -> null;
        };
    }
}
