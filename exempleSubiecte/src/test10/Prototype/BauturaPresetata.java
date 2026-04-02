package test10.Prototype;

import test10.SimpleFactory.clase.IBautura;
import test10.SimpleFactory.fabrica.BauturaFactory;

public class BauturaPresetata implements IBauturaPresetata{
    private IBautura bautura;

    public BauturaPresetata(IBautura bautura) {
        this.bautura = bautura;
    }

    private BauturaPresetata() {

    }

    @Override
    public IBauturaPresetata copiaza() {
        BauturaPresetata bauturaPresetata = new BauturaPresetata();
        bauturaPresetata.bautura = this.bautura.copiaza();
        return bauturaPresetata;
    }

    @Override
    public String toString() {
        return "Comanda presetata: " + bautura.toString();
    }
}
