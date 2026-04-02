package test9.Prototype;

public class Sticker implements ISticker{
    private Masina masina;

    public Sticker(Masina masina) {
        this.masina = masina;
    }

    private Sticker() {
    }


    @Override
    public ISticker copiaza() {
        Sticker sticker = new Sticker();
        sticker.masina = new Masina(this.masina);
        return sticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }
}
