package STB.Proxy.clase;

public class ProxyAutobuz implements IAutobuz{
    private Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void oprireInStatie() {
        if(autobuz.getNrPersoane() != 0) {
            this.autobuz.oprireInStatie();
        }
        else {
            System.out.println("Autobuzul este gol. Retragere la autobaza.");
        }
    }
}
