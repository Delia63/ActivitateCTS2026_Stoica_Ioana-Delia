package Restaurant.Adapter.clase.contextNou;

public class SoftBucatarie implements ISoftBucatarie {
    private int nrFactura;

    public SoftBucatarie(int nrFactura) {
        this.nrFactura = nrFactura;
    }

    @Override
    public void printeazaFactura(Double sumaPlata) {
        System.out.println("Factura cu numarul "+this.nrFactura
                +" a fost printata cu suma "+sumaPlata+" lei");
    }
}
