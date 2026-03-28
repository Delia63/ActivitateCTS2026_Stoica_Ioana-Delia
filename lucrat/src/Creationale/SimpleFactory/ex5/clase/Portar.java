package Creationale.SimpleFactory.ex5.clase;

public class Portar implements Jucator{
    private int nrJucator;
    private String numeJucator;
    private int varsta;

    public Portar(int nrJucator, String numeJucator, int varsta) {
        this.nrJucator = nrJucator;
        this.numeJucator = numeJucator;
        this.varsta = varsta;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Portar: Numar - ").append(this.nrJucator)
                .append(", Numar - ").append(this.nrJucator)
                .append(", Varsta - ").append(this.varsta);
        System.out.println(sb.toString());
    }
}
