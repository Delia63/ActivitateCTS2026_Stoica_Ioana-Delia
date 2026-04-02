package test11.main;

import test11.SimpleFactory.clase.AMasina;
import test11.ClaseSeparate.Masina;
import test11.SimpleFactory.fabrica.MasinaFabrica;
import test11.SimpleFactory.fabrica.TipMasina;
import test11.Singleton.IService;
import test11.Singleton.Service;

public class Main {
    static void main(String[] args) {
        AMasina masina1 = new Masina("PH23SRT", "Volvo");
        AMasina masina2 = new Masina("AG23RTY", "Audi");
        IService service = Service.getInstanta("Calea Roatei",masina1);
        service.descriere();
        IService service1 = Service.getInstanta("Calea Morii",masina2);
        service1.descriere();


        MasinaFabrica masinaFabrica = new MasinaFabrica();
        AMasina SUV1 = masinaFabrica.getMasina(TipMasina.SUV, "PH23SRT","Volvo");
        AMasina VAN1 = masinaFabrica.getMasina(TipMasina.VAN, "AG23RTY","Audi");
        System.out.println(SUV1.toString());
        System.out.println(VAN1.toString());

        service.primesteMasina(SUV1);
    }
}
