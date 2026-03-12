package ro.ase.seminar4.simpleFactory.clase.famClase;

import ro.ase.seminar4.simpleFactory.clase.MijlocTransport;

public class Troleibuz implements MijlocTransport {
    private int nrLinie;
    private String marca;

    public Troleibuz(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul de pe linia ").append(this.nrLinie).append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}
