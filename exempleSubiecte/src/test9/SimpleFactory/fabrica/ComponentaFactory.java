package test9.SimpleFactory.fabrica;

import test9.SimpleFactory.clase.*;

public class ComponentaFactory {
    public IComponenta createComponenta(TipComponenta tipComponenta, Double dimensiune) {
        return switch (tipComponenta) {
            case TipComponenta.Usa -> new Usa(dimensiune);
            case TipComponenta.Bara -> new Bara(dimensiune);
            case TipComponenta.Capota -> new Capota(dimensiune);
            case TipComponenta.Portbagaj -> new Portbagaj(dimensiune);
            default -> null;
        };
    }
}
