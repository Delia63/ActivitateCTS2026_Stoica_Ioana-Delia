package Creationale.SimpleFactory.ex2.clase;

public class Margherita implements Pizza{
    private float pret;
    private int nrIngrediente;

    public Margherita(float pret, int nrIngrediente) {
        this.pret = pret;
        this.nrIngrediente = nrIngrediente;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Margherita are ").append(this.nrIngrediente)
                .append(" ingrediente si costa ").append(this.pret).append(" lei");
        System.out.println(sb.toString());
    }
}
