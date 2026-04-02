package Creationale.SingletonRegistry.ex1.clase;

public class Proiector implements IEchipament{
    @Override
    public void stareEchipament() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proiectorul este activ.");
        System.out.println(sb.toString());
    }
}
