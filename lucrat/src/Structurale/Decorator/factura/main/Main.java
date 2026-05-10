package Structurale.Decorator.factura.main;

import Structurale.Decorator.factura.clase.Factura;
import Structurale.Decorator.factura.clase.IFactura;
import Structurale.Decorator.factura.decorator.Decorator;
import Structurale.Decorator.factura.decorator.FacturaDecorator;

public class Main {
    static void main(String[] args) {
        Factura factura = new Factura(1, 1000);
        factura.printeazaFactura();
        System.out.println();

        Decorator decoratorFactura = new FacturaDecorator(factura);
        decoratorFactura.adaugaDiscount(10);
        decoratorFactura.printeazaFactura();
    }
}
