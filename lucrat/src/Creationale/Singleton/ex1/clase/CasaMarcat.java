package Creationale.Singleton.ex1.clase;

public class CasaMarcat {
    private float sumaTotala;

    private static CasaMarcat instanta = null;

    private CasaMarcat(float sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public float getSumaTotala() {
        return sumaTotala;
    }

    public static synchronized CasaMarcat getInstance(float sumaTotala) {
        if(instanta == null) {
            instanta = new CasaMarcat(sumaTotala);
        }

        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CasaMarcat{");
        sb.append("sumaTotala=").append(sumaTotala);
        sb.append('}');
        return sb.toString();
    }
}
