package test12.FactoryMethod.clase;

public class Ballroom implements ILocatie{
    private Double metriPatrati;

    public Ballroom(Double metriPatrati) {
        this.metriPatrati = metriPatrati;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala Ballroom are ").append(this.metriPatrati).append(" metrii patrati.");
        System.out.println(sb.toString());
    }
}
