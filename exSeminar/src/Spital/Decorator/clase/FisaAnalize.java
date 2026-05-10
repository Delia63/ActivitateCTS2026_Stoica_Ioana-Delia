package Spital.Decorator.clase;

public class FisaAnalize implements IFisaAnalize{
    private String numePacient;
    private int varstaPacient;

    public FisaAnalize(String numePacient, int varstaPacient) {
        this.numePacient = numePacient;
        this.varstaPacient = varstaPacient;
    }

    @Override
    public void printeazaRezultate() {
        System.out.println("Pacientul "+this.numePacient+
                " are varsta "+this.varstaPacient);
    }
}
