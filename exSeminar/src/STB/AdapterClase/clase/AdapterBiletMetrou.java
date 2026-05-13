package STB.AdapterClase.clase;

public class AdapterBiletMetrou implements IMetrou{
    private BiletSTB biletSTB;

    public AdapterBiletMetrou(BiletSTB biletSTB) {
        this.biletSTB = biletSTB;
    }

    @Override
    public void intraInMetrou() {
        this.biletSTB.folosesteBilet();
        System.out.println("Acest bilet a fost folosit la metrou.");
    }
}
