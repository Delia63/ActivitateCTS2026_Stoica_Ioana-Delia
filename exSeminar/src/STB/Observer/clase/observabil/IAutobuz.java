package STB.Observer.clase.observabil;

import STB.Observer.clase.observer.ICalator;

public interface IAutobuz {
    public void abonareCalator(ICalator calator);
    public void dezabonareCalator(ICalator calator);
    public void trimiteNotificare(String mesaj);
}
