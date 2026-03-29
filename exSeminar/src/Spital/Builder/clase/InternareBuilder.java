package Spital.Builder.clase;

public class InternareBuilder implements InternareBuilderAbstract{
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false,false,false,false,nume);
    }

    public InternareBuilder setPatRabatabil(boolean arePatRabatabil) {
        internare.patRabatabil = arePatRabatabil;
        return this;
    }

    public InternareBuilder setMicDejun(boolean areMicDejun) {
        internare.micDejun = areMicDejun;
        return this;
    }

    public InternareBuilder setPapuciCamera(boolean arePapuciCamera) {
        internare.papuciCamera = arePapuciCamera;
        return this;
    }

    public InternareBuilder setHalatInterior(boolean areHalatInterior) {
        internare.halatInterior = areHalatInterior;
        return this;
    }

    public InternareBuilder setNumePacient(String numePacient) {
        internare.numePacient = numePacient;
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
