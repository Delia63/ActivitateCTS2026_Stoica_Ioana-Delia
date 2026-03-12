package ro.ase.seminar4.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instanta = null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public static synchronized Logger getInstance(String sender, String categorie) {
        if(instanta == null) {
            instanta = new Logger(sender, categorie);
        }
        return instanta;
    }
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void afiseazaLog(String text) {
        System.out.println("Cod log: "+this.cod+" Sender: "+this.sender+" Categorie: "+this.categorie+" Text: "+text);
        this.cod++;
    }


}
