package Creationale.SingletonRegistry.ex2.clase;

public class SenzorTemperatura implements IDispozitiv{
    @Override
    public void actioneaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Senzorul de temperatura este activ.");
        System.out.println(sb.toString());
    }
}
