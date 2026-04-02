package test14.Builder;

public class CalculatorBuilder implements ICalculatorBuilder{
    private String procesor;
    private String memorieRAM;

    private String placaVideo;
    private String SSD;
    private String sistemRacire;
    private boolean carcasaRGB;

    public CalculatorBuilder(String procesor, String memorieRAM) {
        this.procesor = procesor;
        this.memorieRAM = memorieRAM;
        this.placaVideo = "";
        this.SSD = "";
        this.sistemRacire = "";
        this.carcasaRGB = false;
    }


    public CalculatorBuilder setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public CalculatorBuilder setSSD(String SSD) {
        this.SSD = SSD;
        return this;
    }

    public CalculatorBuilder setSistemRacire(String sistemRacire) {
        this.sistemRacire = sistemRacire;
        return this;
    }

    public CalculatorBuilder setCarcasaRGB(boolean carcasaRGB) {
        this.carcasaRGB = carcasaRGB;
        return this;
    }

    @Override
    public Calculator build() {
        return new Calculator(this.procesor, this.memorieRAM, this.placaVideo, this.SSD, this.sistemRacire, this.carcasaRGB);
    }
}
