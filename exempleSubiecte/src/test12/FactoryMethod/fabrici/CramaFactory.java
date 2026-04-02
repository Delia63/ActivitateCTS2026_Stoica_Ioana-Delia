package test12.FactoryMethod.fabrici;

import test12.FactoryMethod.clase.Ballroom;
import test12.FactoryMethod.clase.Crama;
import test12.FactoryMethod.clase.ILocatie;

public class CramaFactory implements ILocatieFactory{
    @Override
    public ILocatie getLocatie(Double metriPatrati) {
        return new Crama(metriPatrati);
    }
}
