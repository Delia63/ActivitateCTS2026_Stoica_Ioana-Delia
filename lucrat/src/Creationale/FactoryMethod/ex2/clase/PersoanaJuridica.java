package Creationale.FactoryMethod.ex2.clase;

public class PersoanaJuridica extends Client{

    public PersoanaJuridica(String nume) {
        super(nume);
    }

    @Override
    public void afisareDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientul cu numele ").append(this.nume).append(" este o persoana juridica.");
        System.out.println(sb.toString());
    }
}
