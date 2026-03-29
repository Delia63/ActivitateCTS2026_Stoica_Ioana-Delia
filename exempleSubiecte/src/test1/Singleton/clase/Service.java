package test1.Singleton.clase;

import test1.SimpleFactory.clase.AMasina;

public class Service implements IService{
    private AMasina masinaCurenta;
    private static Service instanta = null;

    private Service() {

    }

    public static synchronized Service getInstanta() {
        if(instanta == null) instanta = new Service();
        return instanta;
    }

    @Override
    public void primesteMasinsa(AMasina masina) {
        this.masinaCurenta = masina;
        System.out.println("Service-ul a acceptat masina " + this.masinaCurenta);
    }
}
