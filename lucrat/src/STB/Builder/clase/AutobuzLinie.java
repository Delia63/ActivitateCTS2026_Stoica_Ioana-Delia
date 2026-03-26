package STB.Builder.clase;

public class AutobuzLinie {
    protected String model;
    protected String numeSofer;
    protected boolean opresteLaCapat;
    protected boolean deschideUsiAutomat;

    public AutobuzLinie(String model, String numeSofer, boolean opresteLaCapat, boolean deschideUsiAutomat) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.opresteLaCapat = opresteLaCapat;
        this.deschideUsiAutomat = deschideUsiAutomat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", opresteLaCapat=").append(opresteLaCapat);
        sb.append(", deschideUsiAutomat=").append(deschideUsiAutomat);
        sb.append('}');
        return sb.toString();
    }
}
