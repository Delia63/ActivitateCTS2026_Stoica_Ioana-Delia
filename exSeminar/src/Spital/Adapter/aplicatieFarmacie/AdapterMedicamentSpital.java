package Spital.Adapter.aplicatieFarmacie;

import Spital.Adapter.aplicatieSpital.MedicamentSpital;

public class AdapterMedicamentSpital extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdapterMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
