package test1.main;

import test1.SimpleFactory.clase.AMasina;
import test1.SimpleFactory.factory.FactoryMasina;
import test1.SimpleFactory.factory.TipMasina;
import test1.Singleton.clase.Service;

public class Main {
    public static void main(String[] args) {
        Service service = Service.getInstanta();
        FactoryMasina factoryMasina = new FactoryMasina();

        AMasina m1 = factoryMasina.getMasina(TipMasina.SEDAN, "PH23RLM", "Passat");
        AMasina m2 = factoryMasina.getMasina(TipMasina.SUV, "AG12LMN", "Volvo");
        AMasina m3 = factoryMasina.getMasina(TipMasina.VAN, "B102ERT", "Mercedes");

        service.primesteMasinsa(m1);
        service.primesteMasinsa(m2);
        service.primesteMasinsa(m3);

    }
}
