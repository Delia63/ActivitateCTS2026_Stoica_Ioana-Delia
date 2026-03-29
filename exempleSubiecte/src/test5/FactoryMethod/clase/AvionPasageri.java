package test5.FactoryMethod.clase;

public class AvionPasageri implements Avion{
    public AvionPasageri() {
    }


    @Override
    public void zboara() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avionul de pasageri a decolat.");
        System.out.println(sb.toString());
    }
}
