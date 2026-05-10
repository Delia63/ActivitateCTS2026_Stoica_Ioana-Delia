package Structurale.Decorator.factura.clase;

public class Factura implements IFactura {
    private int codFactura;
    private double sumaFactura;

    public Factura(int codFactura, double sumaFactura) {
        this.codFactura = codFactura;
        this.sumaFactura = sumaFactura;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Factura cu codul "+codFactura
                + " are o suma de "+sumaFactura);
    }

    public void setSumaFactura(double sumaFactura) {
        this.sumaFactura = sumaFactura;
    }

    public double getSumaFactura() {
        return sumaFactura;
    }
}
