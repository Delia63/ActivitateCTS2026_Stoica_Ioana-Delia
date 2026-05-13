package STB.Flyweight.clase;

public class Autobuz {
    private String model;
    private String anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, String anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public String getAnFabricatie() {
        return anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie='").append(anFabricatie).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
