package Spital.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {
    private Map<String, IPacient> listaPacienti;

    public RegistruPacienti() {
        this.listaPacienti = new HashMap<>();
    }

    public IPacient getPacient( String numePacient,String nrTelefon, String email) {
        if(listaPacienti.containsKey(nrTelefon)) {
            return listaPacienti.get(nrTelefon);
        }
        else {
            IPacient pacient = new Pacient(numePacient, nrTelefon, email);
            listaPacienti.put(nrTelefon, pacient);
            return pacient;
        }
    }
}
