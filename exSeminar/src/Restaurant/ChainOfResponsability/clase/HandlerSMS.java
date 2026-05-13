package Restaurant.ChainOfResponsability.clase;

public class HandlerSMS extends Handler{
    @Override
    public void notificaClient(Client client) {
        if(client.getNrTelefon() != null) {
            System.out.println("SMS: Avem o oferta noua!");
        }
        else {
            this.getUrmatorulHandler().notificaClient(client);
        }
    }
}
