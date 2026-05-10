package Comportamentale.ChainOfResponsability.agentie.main;

import Comportamentale.ChainOfResponsability.agentie.clase.Client;
import Comportamentale.ChainOfResponsability.agentie.clase.handleri.Notificator;
import Comportamentale.ChainOfResponsability.agentie.clase.handleri.NotificatorEmail;
import Comportamentale.ChainOfResponsability.agentie.clase.handleri.NotificatorManager;
import Comportamentale.ChainOfResponsability.agentie.clase.handleri.NotificatorSMS;

public class Main {
    static void main(String[] args) {
        Client client1 = new Client("Popescu", null, null);

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        notificatorSMS.notifica(client1, "TEST");

        Client client2 = new Client("Radu", "078", null);
        notificatorSMS.notifica(client2, "TEST 2");
    }
}
