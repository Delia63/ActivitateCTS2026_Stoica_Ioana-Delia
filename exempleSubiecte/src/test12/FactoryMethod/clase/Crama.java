package test12.FactoryMethod.clase;

public class Crama implements ILocatie{
    private Double metriPatrati;

    public Crama(Double metriPatrati) {
        this.metriPatrati = metriPatrati;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Crama are ").append(this.metriPatrati).append(" metrii patrati.");
        System.out.println(sb.toString());
    }
}
