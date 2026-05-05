package Spital.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Pacient> listaPacienti;


    public Spital(String nume) {
        this.nume = nume;
        listaPacienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient p : listaPacienti) {

            p.receptioneazaNotificare(mesaj + "de la spitalul "+this.nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificaVirus() {
        trimiteMesaj("'Exista un virus in oras.'");
    }

    public void notificaEpidemie() {
        trimiteMesaj("'Exista o epidemie in oras.'");
    }
}
