package test5.FactoryMethod.clase;

public class AvionCargo implements Avion{
    @Override
    public void zboara() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avionul cargo a decolat.");
        System.out.println(sb.toString());
    }
}
