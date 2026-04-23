package Spital.Adapter.main;

import Spital.Adapter.aplicatieFarmacie.AdapterMedicamentSpital;
import Spital.Adapter.aplicatieFarmacie.MedicamentFarmacie;
import Spital.Adapter.aplicatieSpital.MedicamentSpital;

public class Main {
    //adapter de clase nu merge pt ca ar trb ca adapterul sa extinde 2 clase si asta nu merge in java

    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }

    static void main(String[] args) {
        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
//        realizeazaAchizitie(paracetamol); // => pt asta trb adapter

        AdapterMedicamentSpital adapterParacetamol = new AdapterMedicamentSpital(paracetamol);
        realizeazaAchizitie(adapterParacetamol);


    }
}
