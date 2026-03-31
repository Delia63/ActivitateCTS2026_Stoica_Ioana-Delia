package test8.Singleton;

import test8.FactoryMethod.clase.Cafea;
import test8.SimpleFactory.clase.IBautura;

import java.util.List;

public class CasaMarcat {
    List<IBautura> listaComenzi;
    private static CasaMarcat instanta = null;

    private CasaMarcat(List<IBautura> listaComenzi) {
        this.listaComenzi = listaComenzi;
    }

    public Double getPretTotal() {
        Double pretTotal = 0d;
        for(IBautura c : listaComenzi) {
            pretTotal += c.getPret();
        }
        return pretTotal;
    }

    public static synchronized CasaMarcat getInstanta(List<IBautura> listaComenzi) {
        if(instanta == null)
            instanta = new CasaMarcat(listaComenzi);
        return instanta;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CasaMarcat{");
        sb.append("listaComenzi=").append(listaComenzi);
        sb.append('}');
        return sb.toString();
    }
}
