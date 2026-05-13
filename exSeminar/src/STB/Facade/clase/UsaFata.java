package STB.Facade.clase;

public class UsaFata implements Usa{
    @Override
    public void deschideLiber() {
        System.out.println("Usa din fata a fost deschisa in mod liber.");
    }

    @Override
    public void deschideFortata() {
        System.out.println("Usa din fata a fost deschisa in mod fortat.");

    }
}
