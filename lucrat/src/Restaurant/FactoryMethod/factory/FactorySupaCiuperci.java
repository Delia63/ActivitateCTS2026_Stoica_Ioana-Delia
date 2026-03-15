package Restaurant.FactoryMethod.factory;

import Restaurant.FactoryMethod.clase.Supa;
import Restaurant.FactoryMethod.clase.SupaCiuperci;

public class FactorySupaCiuperci implements FactorySupa{
    @Override
    public Supa creareSupa() {
        return new SupaCiuperci();
    }
}
