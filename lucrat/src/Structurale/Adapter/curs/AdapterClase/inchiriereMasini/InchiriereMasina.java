package Structurale.Adapter.curs.AdapterClase.inchiriereMasini;

public class InchiriereMasina {
    private Masina masina;

    public InchiriereMasina(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina() {
        System.out.println("A fost inchiriata masina: "+this.masina.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InchiriereMasina{");
        sb.append("masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }
}
