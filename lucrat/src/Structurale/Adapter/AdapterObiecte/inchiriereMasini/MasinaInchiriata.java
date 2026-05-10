package Structurale.Adapter.AdapterObiecte.inchiriereMasini;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina() {
        System.out.println("A fost inchiriata masina "+this.masina);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasinaInchiriata{");
        sb.append("masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }
}
