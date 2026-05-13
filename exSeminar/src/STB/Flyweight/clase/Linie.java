package STB.Flyweight.clase;

public class Linie implements ILinie{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.println("Linie:\nNumar linie: "+this.nrLinie
                +"\nPrima statie: "+this.primaStatie
                +"\nUltima statie: "+this.ultimaStatie
                +"\n\nAutobuz:\nModel autobuz: "+autobuz.getModel()
                +"\nAn fabricatie: "+autobuz.getAnFabricatie()
                +"Numar locuri: "+autobuz.getNrLocuri());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
