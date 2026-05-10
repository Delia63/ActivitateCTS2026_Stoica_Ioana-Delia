package Restaurant.Adapter.main;

import Restaurant.Adapter.clase.clasaAdapter.SoftBucatarieBar;
import Restaurant.Adapter.clase.contextExistent.SoftBar;
import Restaurant.Adapter.clase.contextNou.ISoftBucatarie;
import Restaurant.Adapter.clase.contextNou.SoftBucatarie;

public class Main {
    public static void main(String[] args) {
        ISoftBucatarie softBucatarie1 = new SoftBucatarie(1);
        softBucatarie1.printeazaFactura(120.0);

        SoftBar softBar1 = new SoftBar();
        softBar1.genereazaNotaPlata(135.0);


        System.out.println("\n");
        SoftBar softBar2 = new SoftBar();
        ISoftBucatarie adapter = new SoftBucatarieBar(softBar2);
        adapter.printeazaFactura(140.0);


    }
}
