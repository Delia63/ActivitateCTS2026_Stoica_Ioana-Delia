package test9.Prototype;

public class Masina implements IMasina{
    private String anFabricatie;
    private Double dimensiune;

    public Masina(String anFabricatie, Double dimensiune) {
        this.anFabricatie = anFabricatie;
        this.dimensiune = dimensiune;
    }

    public Masina(Masina altaMasina) {
        this.anFabricatie = altaMasina.anFabricatie;
        this.dimensiune = altaMasina.dimensiune;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masina: An fabricatie - ").append(this.anFabricatie)
                .append(", Dimensiune - ").append(this.dimensiune);
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("anFabricatie='").append(anFabricatie).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}
