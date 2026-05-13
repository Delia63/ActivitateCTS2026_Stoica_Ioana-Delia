package STB.AdapterClase.clase;

public class BiletSTB {
    private String dataBilet;

    public BiletSTB(String dataBilet) {
        this.dataBilet = dataBilet;
    }

    public String getDataBilet() {
        return dataBilet;
    }

    public void folosesteBilet() {
        System.out.println("Biletul in data de "+this.getDataBilet()
                +" a fost folosit in autobuz.");
    }
}
