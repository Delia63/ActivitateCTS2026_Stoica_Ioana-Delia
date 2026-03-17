package Spital.Builder.clase;

public class InternareBuilderAlternativ implements InternareBuilderAbstractAlternativ{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public InternareBuilderAlternativ setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(this.patRabatabil,this.micDejun,this.papuciCamera,this.halatInterior, nume);
    }
}
