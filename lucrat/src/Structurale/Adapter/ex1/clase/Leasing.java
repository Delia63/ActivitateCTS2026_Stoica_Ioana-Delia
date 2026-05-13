package Structurale.Adapter.ex1.clase;

public class Leasing implements ILeasing{

    @Override
    public void acordaLeasing() {
        System.out.println("Se acorda credit de leasing.");
    }
}
