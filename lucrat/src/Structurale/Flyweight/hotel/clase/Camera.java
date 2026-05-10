package Structurale.Flyweight.hotel.clase;

public class Camera implements ICamera{
    private int codCamera;
    private int nrProsoape;
    private int nrCearsafuri;
    private int nrPerne;
    private int nrUmerase;

    public Camera(int codCamera, int nrProsoape, int nrCearsafuri, int nrPerne, int nrUmerase) {
        this.codCamera = codCamera;
        this.nrProsoape = nrProsoape;
        this.nrCearsafuri = nrCearsafuri;
        this.nrPerne = nrPerne;
        this.nrUmerase = nrUmerase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("codCamera=").append(codCamera);
        sb.append(", nrProsoape=").append(nrProsoape);
        sb.append(", nrCearsafuri=").append(nrCearsafuri);
        sb.append(", nrPerne=").append(nrPerne);
        sb.append(", nrUmerase=").append(nrUmerase);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void tiparire(Rezervare rezervare) {
        System.out.println(this.toString()+" "+rezervare.toString());
    }
}
