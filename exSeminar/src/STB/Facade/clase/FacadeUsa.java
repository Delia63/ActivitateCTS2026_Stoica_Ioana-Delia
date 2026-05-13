package STB.Facade.clase;

public class FacadeUsa {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public FacadeUsa(Usa usaFata, Usa usaMijloc, Usa usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void deschidereUsiLiber() {
        System.out.println("Toate usile: ");
        this.usaFata.deschideLiber();
        this.usaMijloc.deschideLiber();
        this.usaSpate.deschideLiber();
    }

    public void deschidereUsiFortat() {
        System.out.println("Toate usile: ");
        this.usaFata.deschideFortata();
        this.usaMijloc.deschideFortata();
        this.usaSpate.deschideFortata();
    }
}
