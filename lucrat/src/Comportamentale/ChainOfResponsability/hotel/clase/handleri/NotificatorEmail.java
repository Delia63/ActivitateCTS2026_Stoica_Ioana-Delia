package Comportamentale.ChainOfResponsability.hotel.clase.handleri;

import Comportamentale.ChainOfResponsability.hotel.clase.Client;

public class NotificatorEmail extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null) {
            System.out.println("Email: "+mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
