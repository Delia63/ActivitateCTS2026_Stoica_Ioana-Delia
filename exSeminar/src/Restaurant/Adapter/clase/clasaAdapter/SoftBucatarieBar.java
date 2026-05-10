package Restaurant.Adapter.clase.clasaAdapter;

import Restaurant.Adapter.clase.contextExistent.SoftBar;
import Restaurant.Adapter.clase.contextNou.ISoftBucatarie;

public class SoftBucatarieBar implements ISoftBucatarie {
    private SoftBar softBar;

    public SoftBucatarieBar(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura(Double sumaPlata) {
        softBar.genereazaNotaPlata(sumaPlata);
    }
}
