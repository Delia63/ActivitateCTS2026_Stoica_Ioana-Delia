package STB.Builder.clase;

public class AutobuzBuilder {
    private boolean opresteLaCapat;
    private boolean deschideUsiAutomat;


    public AutobuzBuilder() {
        this.opresteLaCapat = false;
        this.deschideUsiAutomat = false;
    }

    public AutobuzBuilder setOpresteLaCapat(boolean opresteLaCapat) {
        this.opresteLaCapat = opresteLaCapat;
        return this;
    }

    public AutobuzBuilder setDeschideUsiAutomat(boolean deschideUsiAutomat) {
        this.deschideUsiAutomat = deschideUsiAutomat;
        return this;
    }


    public AutobuzLinie build(String model, String numeSofer) {
        return new AutobuzLinie(model, numeSofer, this.opresteLaCapat, this.deschideUsiAutomat);
    }
}
