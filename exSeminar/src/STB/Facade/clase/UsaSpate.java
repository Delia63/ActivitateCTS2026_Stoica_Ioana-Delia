package STB.Facade.clase;

public class UsaSpate implements Usa{
    @Override
    public void deschideLiber() {
        System.out.println("Usa din spate a fost deschisa in mod liber.");

    }

    @Override
    public void deschideFortata() {
        System.out.println("Usa din spate a fost deschisa in mod fortat.");

    }
}
