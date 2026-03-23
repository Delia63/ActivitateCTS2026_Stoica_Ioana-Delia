package Creationale.SimpleFactory.ex3.clase;

public class SH implements Piesa{
    private int id;

    public SH(int id) {
        this.id = id;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Piesa cu id ").append(this.id)
                .append("  este de la SH.");
        System.out.println(sb.toString());
    }
}
