package STB.Facade.clase;

public class UsaMijloc implements Usa{
    @Override
    public void deschideLiber() {
        System.out.println("Usa din mijloc a fost deschisa in mod liber.");

    }

    @Override
    public void deschideFortata() {
        System.out.println("Usa din mijloc a fost deschisa in mod fortat.");

    }
}
