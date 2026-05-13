package Restaurant.ChainOfResponsability.clase;

public class HandlerManager extends Handler{
    @Override
    public void notificaClient(Client client) {
        System.out.println("Manager: Nu avem date pentru client.");
    }
}
