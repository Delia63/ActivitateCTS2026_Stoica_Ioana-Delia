package test15.FactoryMethod.clase;

public class Camion implements ITransport{
    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aceasta ruta are ca mod de transport camionul.");
        System.out.println(sb.toString());
    }
}
