package Spital.Proxy.ProxySpital;

import Spital.Proxy.clase.ISpital;
import Spital.Proxy.clase.Pacient;
import Spital.Proxy.clase.Spital;

public class ProxyAsigurare implements ISpital {
    ISpital spital;

    public ProxyAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()) {
            spital.interneazaPacient(pacient);
        }
        else System.out.println("Pacientul "+pacient.getNume()+" nu are asigurare.");
    }
}
