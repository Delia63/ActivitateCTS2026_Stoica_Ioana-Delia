package Spital.Adapter.aplicatieSpital;

public class MedicamentSpital {
    public void achizitioneazaMedicament() {
        System.out.println(
                prezintaReteta() ? "Medicament achizitionat." : "Nu are reteta valida"
        );
    }

    private boolean prezintaReteta() {
        return true;
    }
}
