package Creationale.SimpleFactory.ex3.clase;

public class Aftermarket implements Piesa{
    private int id;

    public Aftermarket(int id) {
        this.id = id;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Piesa cu id ").append(this.id)
                .append("  este de la aftermarket.");
        System.out.println(sb.toString());
    }
}
