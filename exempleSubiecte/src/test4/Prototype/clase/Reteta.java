package test4.Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
    private Map<String, Double> listaMedicamente;

    public Reteta(Map<String, Double> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    private Reteta() {

    }

    @Override
    public IReteta copiaza() {
        Reteta reteta = new Reteta();
        reteta.listaMedicamente = new HashMap<String, Double>(this.listaMedicamente);

        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
