package Spital.Facade.clase;

import java.lang.reflect.Array;

public class Salon {
    private boolean paturiLibere[] = new boolean[50];
    private static Salon instanta = null;

    private Salon() {
        paturiLibere[1] = true;
        paturiLibere[2] = true;
        paturiLibere[3] = true;
        paturiLibere[4] = true;
        paturiLibere[5] = true;
        paturiLibere[10] = true;
    }

    public int suntPaturiLibere() {
        for(int i=0; i<paturiLibere.length; i++)
        {
            if(paturiLibere[i] == true) return i;
        }
        return -1;
    }

    public void ocupaPat(int nrPat) {
        paturiLibere[nrPat] = false;
    }

    public static synchronized Salon getInstance() {
        if(instanta == null) {
            instanta = new Salon();
        }
        return instanta;
    }
}
