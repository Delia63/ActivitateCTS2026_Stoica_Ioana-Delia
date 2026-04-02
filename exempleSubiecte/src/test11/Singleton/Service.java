package test11.Singleton;

import test11.SimpleFactory.clase.AMasina;

public class Service implements IService{
    private String nume;
    private AMasina masinaAcceptata;
    private static Service instanta = null;

    private Service(String nume, AMasina masinaAcceptata) {
        this.nume = nume;
        this.masinaAcceptata = masinaAcceptata;
    }

    public static synchronized Service getInstanta(String nume, AMasina masina) {
        if(instanta == null) instanta = new Service(nume, masina);
        return instanta;
    }

    public void primesteMasina(AMasina masina) {
        System.out.println("Service-ul " + this.nume + " repara acum: " + masina.toString());
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Service ").append(this.nume).append(" a acceptat masina ").append(this.masinaAcceptata.toString());
        System.out.println(sb.toString());
    }
}
