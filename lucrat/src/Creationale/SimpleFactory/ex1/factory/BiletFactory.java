package Creationale.SimpleFactory.ex1.factory;

import Creationale.SimpleFactory.ex1.clase.Abonament;
import Creationale.SimpleFactory.ex1.clase.Card;
import Creationale.SimpleFactory.ex1.clase.Sms;
import Creationale.SimpleFactory.ex1.clase.TitluCalatorie;

public class BiletFactory {
    public TitluCalatorie getBilet(TipTitlu tipTitlu) {
        return switch(tipTitlu) {
            case TipTitlu.ABONAMENT -> new Abonament();
            case TipTitlu.CARD -> new Card();
            case TipTitlu.SMS -> new Sms();
            default -> null;
        };
    }


}
