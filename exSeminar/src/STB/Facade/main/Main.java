package STB.Facade.main;

import STB.Facade.clase.*;

public class Main {
    static void main(String[] args) {
        Usa usaFata = new UsaFata();
        Usa usaMijloc = new UsaMijloc();
        Usa usaSpate = new UsaSpate();

//        usaFata.deschideFortata();
//        usaMijloc.deschideLiber();

        FacadeUsa facadeUsa = new FacadeUsa(usaFata, usaMijloc, usaSpate);
        facadeUsa.deschidereUsiLiber();
        System.out.println();
        facadeUsa.deschidereUsiFortat();
    }
}
