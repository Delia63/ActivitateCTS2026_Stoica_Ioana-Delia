package Restaurant.FactoryMethod.fabrici;

import Restaurant.FactoryMethod.clase.Ciorba;
import Restaurant.FactoryMethod.clase.FelMancare;
import Restaurant.FactoryMethod.clase.SupaCrema;

public class SupaFactory implements FelMancareFactory{
    @Override
    public FelMancare getFelMancare(TipFelMancare tip, float gramaj, float pret) {
        return switch (tip) {
            case TipSupa.SUPA_CREMA -> new SupaCrema(gramaj, pret);
            case TipSupa.CIORBA -> new Ciorba(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tip, float gramaj, float pret, float calorii) {
        return this.getFelMancare(tip, gramaj, pret);
    }
}
