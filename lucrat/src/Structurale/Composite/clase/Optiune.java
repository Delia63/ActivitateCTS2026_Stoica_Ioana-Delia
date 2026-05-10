package Structurale.Composite.clase;

public interface Optiune {
    public void stergeNod(Optiune optiune) throws Exception;
    public void adaugaNod(Optiune optiune) throws Exception;
    public Optiune getNod(int index) throws Exception;
    public void descriere();
}
