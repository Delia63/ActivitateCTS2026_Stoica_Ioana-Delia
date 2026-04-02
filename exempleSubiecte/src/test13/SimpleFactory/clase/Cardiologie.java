package test13.SimpleFactory.clase;

public class Cardiologie implements IInternare{
    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aceasta este sectia de cardiologie.");
        System.out.println(sb.toString());
    }
}
