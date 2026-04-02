package test12.FactoryMethod.fabrici;

import test12.FactoryMethod.clase.Ballroom;
import test12.FactoryMethod.clase.ILocatie;

public class BallroomFactory implements ILocatieFactory{
    @Override
    public ILocatie getLocatie(Double metriPatrati) {
        return new Ballroom(metriPatrati);
    }
}
