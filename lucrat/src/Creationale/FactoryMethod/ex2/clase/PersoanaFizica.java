package Creationale.FactoryMethod.ex2.clase;

public class PersoanaFizica extends Client{
    public PersoanaFizica(String nume) {
        super(nume);
    }

    @Override
    public void afisareDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientul cu numele ").append(this.nume).append(" este o persoana fizica.");
        System.out.println(sb.toString());
    }
}
