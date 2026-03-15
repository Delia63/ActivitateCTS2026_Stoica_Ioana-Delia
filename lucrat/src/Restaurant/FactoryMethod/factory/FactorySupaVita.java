package Restaurant.FactoryMethod.factory;

import Restaurant.FactoryMethod.clase.Supa;
import Restaurant.FactoryMethod.clase.SupaVita;

public class FactorySupaVita implements FactorySupa{
    @Override
    public Supa creareSupa() {
        return new SupaVita();
    }
}
