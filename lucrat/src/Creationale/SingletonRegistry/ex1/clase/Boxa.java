package Creationale.SingletonRegistry.ex1.clase;

public class Boxa implements IEchipament{
    @Override
    public void stareEchipament() {
        StringBuilder sb = new StringBuilder();
        sb.append("Boxa este activa.");
        System.out.println(sb.toString());
    }
}
