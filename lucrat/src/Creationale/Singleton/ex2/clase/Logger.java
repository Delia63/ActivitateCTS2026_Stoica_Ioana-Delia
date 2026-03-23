package Creationale.Singleton.ex2.clase;

public class Logger {
    private int idNotificare;

    private static Logger instanta = null;

    public Logger(int idNotificare) {
        this.idNotificare = idNotificare;
    }

    public int getIdNotificare() {
        return idNotificare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Logger{");
        sb.append("idNotificare=").append(idNotificare);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Logger getInstance(int id) {
        if(instanta == null) {
            instanta = new Logger(id);
        }

        return instanta;
    }
}
