package Structurale.Composite.ex1.clase;

public class Loc implements Structura {
    private int nrLoc;


    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public void descriereSectiune(String spatii) {
        System.out.println(spatii + "Loc: " + this.nrLoc);
    }
}
