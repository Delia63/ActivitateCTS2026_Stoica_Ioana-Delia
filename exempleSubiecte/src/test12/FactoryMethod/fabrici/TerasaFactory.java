package test12.FactoryMethod.fabrici;

import test12.FactoryMethod.clase.Ballroom;
import test12.FactoryMethod.clase.ILocatie;
import test12.FactoryMethod.clase.Terasa;

public class TerasaFactory implements ILocatieFactory{
    @Override
    public ILocatie getLocatie(Double metriPatrati) {
        return new Terasa(metriPatrati);
    }
}
