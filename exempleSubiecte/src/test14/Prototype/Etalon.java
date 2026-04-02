package test14.Prototype;

import test14.Builder.Calculator;
import test14.Builder.CalculatorBuilder;

public class Etalon implements IEtalon{
    private Calculator calculator;


    public Etalon(Calculator calculator) {
        this.calculator = calculator;
    }

    private Etalon() {}

    @Override
    public Etalon copiaza() {
        Etalon etalon = new Etalon();
        etalon.calculator = this.calculator.copiazaCalculator();
        return etalon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.calculator.toString());
        return sb.toString();
    }
}
