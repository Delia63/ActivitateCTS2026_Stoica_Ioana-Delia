package Restaurant.FactoryMethod.main;

import Restaurant.FactoryMethod.clase.Supa;
import Restaurant.FactoryMethod.clase.SupaLegume;
import Restaurant.FactoryMethod.factory.FactorySupa;
import Restaurant.FactoryMethod.factory.FactorySupaCiuperci;
import Restaurant.FactoryMethod.factory.FactorySupaLegume;
import Restaurant.FactoryMethod.factory.FactorySupaVita;

public class Main {
    public static void main(String[] args) {
        FactorySupa factoryLegume = new FactorySupaLegume();
        Supa supaLegume = factoryLegume.creareSupa();
        supaLegume.descriere();

        FactorySupa factoryVita = new FactorySupaVita();
        Supa supaVita = factoryVita.creareSupa();
        supaVita.descriere();

        FactorySupa factoryCiuperci = new FactorySupaCiuperci();
        Supa supaCiuperci = factoryCiuperci.creareSupa();
        supaCiuperci.descriere();

    }
}
