package ro.ase.seminar4.simpleFactory.clase.famClase;

import ro.ase.seminar4.simpleFactory.clase.MijlocTransport;

public class Autobuz implements MijlocTransport {
    private int nrLinie;
    private String marca;

    public Autobuz(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul de pe linia ").append(this.nrLinie).append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}
