package Restaurant.FactoryMethod.fabrici;

import Restaurant.FactoryMethod.clase.Clatite;
import Restaurant.FactoryMethod.clase.FelMancare;
import Restaurant.FactoryMethod.clase.Papanasi;

public class DesertFactory implements FelMancareFactory{
    @Override
    public FelMancare getFelMancare(TipFelMancare tip, float gramaj, float pret) {
        return this.getFelMancare(tip, gramaj, pret, 500);
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tip, float gramaj, float pret, float calorii) {
        return switch (tip) {
            case TipDesert.PAPANASI -> new Papanasi(gramaj, calorii, pret);
            case TipDesert.CLATITE -> new Clatite(gramaj, calorii, pret);
            default -> null;
        };
    }
}
