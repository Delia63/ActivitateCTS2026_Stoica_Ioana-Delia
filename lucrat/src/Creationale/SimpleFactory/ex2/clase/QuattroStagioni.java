package Creationale.SimpleFactory.ex2.clase;

public class QuattroStagioni implements Pizza{
    private float pret;
    private int nrIngrediente;

    public QuattroStagioni(float pret, int nrIngrediente) {
        this.pret = pret;
        this.nrIngrediente = nrIngrediente;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Quattro Stagioni are ").append(this.nrIngrediente)
                .append(" ingrediente si costa ").append(this.pret).append(" lei");
        System.out.println(sb.toString());
    }
}
