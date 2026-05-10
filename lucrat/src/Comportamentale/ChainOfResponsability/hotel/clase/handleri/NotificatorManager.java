package Comportamentale.ChainOfResponsability.hotel.clase.handleri;

import Comportamentale.ChainOfResponsability.hotel.clase.Client;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Nu exista date pentru clientul "+client.getNume());
    }
}
