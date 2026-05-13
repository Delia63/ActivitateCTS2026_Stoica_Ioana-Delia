package Structurale.Composite.curs.main;

import Structurale.Composite.curs.clase.Categorie;
import Structurale.Composite.curs.clase.Item;
import Structurale.Composite.curs.clase.Optiune;

public class Main {
    static void main(String[] args) throws Exception {
        Optiune cFile=new Categorie("File");
        Optiune cCamere=new Categorie("Camere");
        Optiune cOferte=new Categorie("Oferte");

        Optiune iOpen=new Item("Open");
        Optiune iSave=new Item("Save");
        Optiune iVizualizare=new Item("Vizualizare camere");
        Optiune iEditare=new Item("Editare camere");
        Optiune iOfertaCraciun=new Item("Oferte craciun");
        Optiune iCreazaOferta=new Item("Creaza oferta");

        cCamere.adaugaNod(iVizualizare);
        cCamere.adaugaNod(iEditare);

        cOferte.adaugaNod(iOfertaCraciun);
        cOferte.adaugaNod(iCreazaOferta);

        cFile.adaugaNod(iOpen);
        cFile.adaugaNod(iSave);

        cCamere.descriere();
        cOferte.descriere();
//        cFile.getNod(0).descriere();
        iOpen.stergeNod(iOpen);
        cFile.stergeNod(iOpen);
        cFile.descriere();
    }
}
