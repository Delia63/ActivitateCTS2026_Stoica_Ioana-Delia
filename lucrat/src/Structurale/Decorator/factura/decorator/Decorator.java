package Structurale.Decorator.factura.decorator;

import Structurale.Decorator.factura.clase.Factura;
import Structurale.Decorator.factura.clase.IFactura;

public abstract class Decorator implements IFactura {
    protected Factura factura;

    public Decorator(Factura factura) {
        this.factura = factura;
    }

    @Override
    public void printeazaFactura() {
        this.factura.printeazaFactura();
        System.out.println("La multi ani!");
    }

    public abstract void adaugaDiscount(int procent);
}
