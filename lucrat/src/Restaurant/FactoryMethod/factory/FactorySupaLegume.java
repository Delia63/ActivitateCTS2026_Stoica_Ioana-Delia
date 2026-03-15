package Restaurant.FactoryMethod.factory;

import Restaurant.FactoryMethod.clase.Supa;
import Restaurant.FactoryMethod.clase.SupaLegume;

public class FactorySupaLegume implements FactorySupa{
    @Override
    public Supa creareSupa() {
        return new SupaLegume();
    }
}
