package test9.main;

import test9.Prototype.ISticker;
import test9.Prototype.Masina;
import test9.Prototype.Sticker;
import test9.SimpleFactory.clase.IComponenta;
import test9.SimpleFactory.fabrica.ComponentaFactory;
import test9.SimpleFactory.fabrica.TipComponenta;

public class Main {
    static void main(String[] args) {
        Masina masina1 = new Masina("2007", 1200d);
        ISticker sticker1 = new Sticker(masina1);

        ISticker sticker2 = sticker1.copiaza();
        System.out.println(sticker1);
        System.out.println(sticker2);

        ComponentaFactory componentaFactory = new ComponentaFactory();
        IComponenta usa = componentaFactory.createComponenta(TipComponenta.Usa, 500d);
        IComponenta bara = componentaFactory.createComponenta(TipComponenta.Bara, 250d);
        IComponenta portbagaj = componentaFactory.createComponenta(TipComponenta.Portbagaj, 1500d);

        usa.descriere();
        bara.descriere();
        portbagaj.descriere();
    }
}
