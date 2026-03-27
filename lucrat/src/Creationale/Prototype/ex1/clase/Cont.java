package Creationale.Prototype.ex1.clase;

import java.util.HashMap;
import java.util.Map;

public class Cont implements ICont{
    private String numeClient;
    private Map<String, Boolean> documente;

    public Cont(String numeClient, Map<String, Boolean> documente) {
        this.numeClient = numeClient;
        this.documente = documente;
    }

    private Cont() {

    }

    @Override
    public ICont copiaza() {
        Cont cont = new Cont();
        cont.numeClient = this.numeClient;
        cont.documente = new HashMap<>(this.documente);
        return cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", documente=").append(documente);
        sb.append('}');
        return sb.toString();
    }
}
