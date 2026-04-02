package test13.SimpleFactory.clase;

public class Neurologie implements IInternare{
    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aceasta este sectia de neurologie.");
        System.out.println(sb.toString());
    }
}
