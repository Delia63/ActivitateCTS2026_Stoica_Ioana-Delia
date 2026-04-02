package test12.main;

import test12.Builder.Builder;
import test12.Builder.IBuilder;
import test12.Builder.MeniuEveniment;
import test12.FactoryMethod.clase.ILocatie;
import test12.FactoryMethod.fabrici.BallroomFactory;
import test12.FactoryMethod.fabrici.CramaFactory;
import test12.FactoryMethod.fabrici.ILocatieFactory;

public class Main {
    static void main(String[] args) {
        Builder builder1 = new Builder("Meniu mic");
        MeniuEveniment meniuEveniment1 = builder1.setFelPrincipal(true).build();

        Builder builder2 = new Builder("Meniu mare");
        MeniuEveniment meniuEveniment2 = builder2.setFelPrincipal(true)
                .setDesert(true).setPachetBauturi(true).setScaunCopil(true)
                .setDecorMasa(true).build();
        System.out.println(meniuEveniment1);
        System.out.println(meniuEveniment2);

        ILocatieFactory ballroomFactory = new BallroomFactory();
        ILocatie ballroom = ballroomFactory.getLocatie(500.0);
        ILocatieFactory cramaFactory = new CramaFactory();
        ILocatie crama = cramaFactory.getLocatie(100.0);
        ballroom.afiseazaDetalii();
        crama.afiseazaDetalii();
    }
}
