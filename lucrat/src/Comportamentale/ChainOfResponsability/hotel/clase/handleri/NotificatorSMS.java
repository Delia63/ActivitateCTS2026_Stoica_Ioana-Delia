package Comportamentale.ChainOfResponsability.hotel.clase.handleri;

import Comportamentale.ChainOfResponsability.hotel.clase.Client;

public class NotificatorSMS extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            System.out.println("Telefon: "+mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
