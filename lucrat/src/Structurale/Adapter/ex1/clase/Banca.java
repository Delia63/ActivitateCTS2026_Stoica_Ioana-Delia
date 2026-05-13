package Structurale.Adapter.ex1.clase;

public class Banca implements IBanca{
    @Override
    public void acordaCredit() {
        System.out.println("Se ofera credit bancar.");
    }
}
