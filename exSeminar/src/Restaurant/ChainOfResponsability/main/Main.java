package Restaurant.ChainOfResponsability.main;

import Restaurant.ChainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Lucia", "07", "gf");

        Handler handlerSMS = new HandlerSMS();
        Handler handlerEmail = new HandlerEmail();
        Handler handlerManager = new HandlerManager();

        handlerSMS.setUrmatorulHandler(handlerEmail);
        handlerEmail.setUrmatorulHandler(handlerManager);

        handlerSMS.notificaClient(client1);
        System.out.println();

        Client client2 = new Client("Lucia", null, "gf");
        handlerSMS.notificaClient(client2);

        Client client3 = new Client("Lucia", null, null);
        handlerSMS.notificaClient(client3);
    }
}
