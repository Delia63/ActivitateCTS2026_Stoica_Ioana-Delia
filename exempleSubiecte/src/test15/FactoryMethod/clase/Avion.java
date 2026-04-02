package test15.FactoryMethod.clase;

public class Avion implements ITransport{
    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aceasta ruta are ca mod de transport avionul.");
        System.out.println(sb.toString());
    }
}
