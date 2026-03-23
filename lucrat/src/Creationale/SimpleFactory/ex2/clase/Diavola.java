package Creationale.SimpleFactory.ex2.clase;

public class Diavola implements Pizza{
    private float pret;
    private int nrIngrediente;

    public Diavola(float pret, int nrIngrediente) {
        this.pret = pret;
        this.nrIngrediente = nrIngrediente;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Diavola are ").append(this.nrIngrediente)
                .append(" ingrediente si costa ").append(this.pret).append(" lei");
        System.out.println(sb.toString());
    }
}
