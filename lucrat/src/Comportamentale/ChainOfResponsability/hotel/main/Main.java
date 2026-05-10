package Comportamentale.ChainOfResponsability.hotel.main;

import Comportamentale.ChainOfResponsability.hotel.clase.Client;
import Comportamentale.ChainOfResponsability.hotel.clase.handleri.Notificator;
import Comportamentale.ChainOfResponsability.hotel.clase.handleri.NotificatorEmail;
import Comportamentale.ChainOfResponsability.hotel.clase.handleri.NotificatorManager;
import Comportamentale.ChainOfResponsability.hotel.clase.handleri.NotificatorSMS;

public class Main {
    static void main(String[] args) {
        Client client1 = new Client("Lucia", null, null);

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        notificatorSMS.notifica(client1, "TEST");
    }
}
