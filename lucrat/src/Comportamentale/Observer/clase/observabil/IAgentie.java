package Comportamentale.Observer.clase.observabil;

import Comportamentale.Observer.clase.observer.IClient;

public interface IAgentie {
    public void abonareClient(IClient client);
    public void dezabonareClient(IClient client);
    public void trimiteNotificare(String mesaj);
}
