package Creationale.SimpleFactory.ex3.clase;

public class Originala implements Piesa{
    private int id;

    public Originala(int id) {
        this.id = id;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Piesa cu id ").append(this.id)
                .append("  este originala.");
        System.out.println(sb.toString());
    }
}
