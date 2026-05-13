package STB.Decorator.main;

import STB.Decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("12.05.2026", 2.5);
        bilet.printeazaBilet();
        System.out.println();

        Decorator decoratorAnuNou = new FelicitareAnulNou(bilet);
        decoratorAnuNou.printeazaFelicitare();
        System.out.println();

        Decorator decoratorPaste = new FelicitarePaste(bilet);
        decoratorPaste.printeazaFelicitare();
    }
}
