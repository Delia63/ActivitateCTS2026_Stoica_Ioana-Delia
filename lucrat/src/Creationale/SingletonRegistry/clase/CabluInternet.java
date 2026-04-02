package Creationale.SingletonRegistry.clase;

public class CabluInternet implements IEchipament{
    @Override
    public void stareEchipament() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cablul de internet este activ.");
        System.out.println(sb.toString());
    }
}
