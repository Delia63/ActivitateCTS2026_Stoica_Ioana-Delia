package Spital.Builder.clase;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuciCamera;
    protected boolean halatInterior;
    protected String numePacient;

    public Internare(boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
