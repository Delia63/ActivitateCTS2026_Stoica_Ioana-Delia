package test13.SimpleFactory.clase;

public class Gastroenterologie implements IInternare{
    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aceasta este sectia de gastroenterologie.");
        System.out.println(sb.toString());
    }
}
