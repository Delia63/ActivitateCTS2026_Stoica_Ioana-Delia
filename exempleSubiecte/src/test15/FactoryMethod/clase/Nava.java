package test15.FactoryMethod.clase;

public class Nava implements ITransport{
    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aceasta ruta are ca mod de transport nava.");
        System.out.println(sb.toString());
    }
}
