package test14.Builder;

public class Calculator {
    private String procesor;
    private String memorieRAM;

    private String placaVideo;
    private String SSD;
    private String sistemRacire;
    private boolean carcasaRGB;

    public Calculator(String procesor, String memorieRAM, String placaVideo, String SSD, String sistemRacire, boolean carcasaRGB) {
        this.procesor = procesor;
        this.memorieRAM = memorieRAM;
        this.placaVideo = placaVideo;
        this.SSD = SSD;
        this.sistemRacire = sistemRacire;
        this.carcasaRGB = carcasaRGB;
    }

    public  Calculator(Calculator altCalculator) {
        this.procesor = altCalculator.procesor;
        this.memorieRAM = altCalculator.memorieRAM;
        this.placaVideo = altCalculator.placaVideo;
        this.SSD = altCalculator.SSD;
        this.sistemRacire = altCalculator.sistemRacire;
        this.carcasaRGB = altCalculator.carcasaRGB;
    }

    public Calculator copiazaCalculator() {
        return new Calculator(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculator{");
        sb.append("procesor='").append(procesor).append('\'');
        sb.append(", memorieRAM='").append(memorieRAM).append('\'');
        sb.append(", placaVideo='").append(placaVideo).append('\'');
        sb.append(", SSD='").append(SSD).append('\'');
        sb.append(", sistemRacire='").append(sistemRacire).append('\'');
        sb.append(", carcasaRGB=").append(carcasaRGB);
        sb.append('}');
        return sb.toString();
    }
}
