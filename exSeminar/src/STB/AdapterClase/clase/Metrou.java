package STB.AdapterClase.clase;

public class Metrou implements IMetrou{
    private String numeMetrou;

    public Metrou(String numeMetrou) {
        this.numeMetrou = numeMetrou;
    }

    public void intraInMetrou() {
        System.out.println("Ati intrat in metrou la "+this.numeMetrou);
    }
}
