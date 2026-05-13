package Restaurant.ChainOfResponsability.clase;

public class HandlerEmail extends Handler{
    @Override
    public void notificaClient(Client client) {
        if(client.getEmail() != null) {
            System.out.println("Email: Avem o oferta noua!");
        }
        else {
            this.getUrmatorulHandler().notificaClient(client);
        }
    }
}
