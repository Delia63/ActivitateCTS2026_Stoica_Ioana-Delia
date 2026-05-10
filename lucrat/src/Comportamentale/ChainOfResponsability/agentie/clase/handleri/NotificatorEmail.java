package Comportamentale.ChainOfResponsability.agentie.clase.handleri;

import Comportamentale.ChainOfResponsability.agentie.clase.Client;

public class NotificatorEmail extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null) {
            System.out.println(client.getNume() + " ai un email cu mesajul " + mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
