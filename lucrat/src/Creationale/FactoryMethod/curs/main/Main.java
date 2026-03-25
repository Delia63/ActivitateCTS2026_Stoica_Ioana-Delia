package Creationale.FactoryMethod.curs.main;

import Creationale.FactoryMethod.curs.clase.PachetTuristic;
import Creationale.FactoryMethod.curs.fabrici.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory fabricaCazare = new CazareFactory();
        PachetTuristicFactory fabricaTransport = new TransportFactory();

         PachetTuristic pachet = fabricaCazare.crearePachet(TipCazare.CazareCabana);
         pachet.afisareDescriere();
         pachet = fabricaTransport.crearePachet(TipTransport.transportAutocar);
         pachet.afisareDescriere();
    }
}
