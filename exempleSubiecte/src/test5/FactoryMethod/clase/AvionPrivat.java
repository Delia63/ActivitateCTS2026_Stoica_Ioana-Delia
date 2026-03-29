package test5.FactoryMethod.clase;

public class AvionPrivat implements Avion{
    @Override
    public void zboara() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avionul privat a decolat.");
        System.out.println(sb.toString());
    }
}
