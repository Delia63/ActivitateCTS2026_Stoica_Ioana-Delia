package Structurale.Adapter.ex1.clase;

public class AdapterLeasingBanca implements IBanca{
    private ILeasing leasing;

    public AdapterLeasingBanca(ILeasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void acordaCredit() {
        this.leasing.acordaLeasing();
    }
}
