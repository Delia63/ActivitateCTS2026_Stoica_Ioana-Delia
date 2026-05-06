package STB.Command.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void pleacaPeTraseu(int nrLinie) {
        System.out.println("Autobuzul "+this.nrInmatriculare+" merge pe traseul "+nrLinie);
    }
}
