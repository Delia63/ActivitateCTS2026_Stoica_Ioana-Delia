package Structurale.Decorator.factura.decorator;

import Structurale.Decorator.factura.clase.Factura;
import Structurale.Decorator.factura.clase.IFactura;

public class FacturaDecorator extends Decorator{

    public FacturaDecorator(Factura factura) {
        super(factura);
    }

    @Override
    public void adaugaDiscount(int procent) {
        super.factura.setSumaFactura(super.factura.getSumaFactura()*(100-procent)/100);
    }
}
