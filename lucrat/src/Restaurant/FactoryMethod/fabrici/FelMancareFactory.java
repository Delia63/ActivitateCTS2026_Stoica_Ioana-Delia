package Restaurant.FactoryMethod.fabrici;

import Restaurant.FactoryMethod.clase.FelMancare;

public interface FelMancareFactory {
    public FelMancare getFelMancare(TipFelMancare tip, float gramaj, float pret);
    public FelMancare getFelMancare(TipFelMancare tip, float gramaj, float pret, float calorii);
}
