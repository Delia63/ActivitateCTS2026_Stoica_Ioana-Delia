package Comportamentale.ChainOfResponsability.agentie.clase.handleri;

import Comportamentale.ChainOfResponsability.agentie.clase.Client;

public class NotificatorSMS extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            System.out.println(client.getNume() + " ai un SMS cu mesajul " + mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
