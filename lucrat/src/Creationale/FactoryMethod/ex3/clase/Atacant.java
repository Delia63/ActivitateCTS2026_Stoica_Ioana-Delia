package Creationale.FactoryMethod.ex3.clase;

public class Atacant implements Jucator{
    private int nrJucator;
    private String numeJucator;
    private int varsta;

    public Atacant(int nrJucator, String numeJucator, int varsta) {
        this.nrJucator = nrJucator;
        this.numeJucator = numeJucator;
        this.varsta = varsta;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Atacant: Numar - ").append(this.nrJucator)
                .append(", Numar - ").append(this.nrJucator)
                .append(", Varsta - ").append(this.varsta);
        System.out.println(sb.toString());
    }
}
