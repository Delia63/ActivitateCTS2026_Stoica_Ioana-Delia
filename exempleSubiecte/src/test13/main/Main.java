package test13.main;

import test13.SimpleFactory.clase.IInternare;
import test13.SimpleFactory.fabrica.InternareFactory;
import test13.SimpleFactory.fabrica.TipInternare;
import test13.Singleton.Spital;

public class Main {
    public static void main(String[] args) {
        Spital spital1 = Spital.getInstanta("Aurora", "str. Soarelui", "Mihai Popescu");
        Spital spital2 = Spital.getInstanta("Lexus", "str. Curcubeeului", "Mircea Radoi");
        System.out.println(spital1);
        System.out.println(spital2);

        InternareFactory internareFactory = new InternareFactory();
        IInternare cardiologie = internareFactory.getInternare(TipInternare.Cardiologie);
        cardiologie.descriere();

    }
}
