package test12.FactoryMethod.clase;

public class Terasa implements ILocatie{
    private Double metriPatrati;

    public Terasa(Double metriPatrati) {
        this.metriPatrati = metriPatrati;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Terasa are ").append(this.metriPatrati).append(" metrii patrati.");
        System.out.println(sb.toString());
    }
}
