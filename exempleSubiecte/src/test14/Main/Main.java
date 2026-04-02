package test14.Main;

import test14.Builder.Calculator;
import test14.Builder.CalculatorBuilder;
import test14.Builder.ICalculatorBuilder;
import test14.Prototype.Etalon;
import test14.Prototype.IEtalon;

public class Main {
    static void main(String[] args) {
        CalculatorBuilder builder = new CalculatorBuilder("Intel I7","16RAM");
        Calculator Lenovo = builder.setPlacaVideo("Intel I7").setPlacaVideo("Intel").setCarcasaRGB(true).build();
        System.out.println(Lenovo);

        IEtalon etalonLenovo = new Etalon(Lenovo);
        IEtalon comandaLenovo = etalonLenovo.copiaza();
        System.out.println(comandaLenovo);
    }
}
