package Creationale.SingletonRegistry.ex2.clase;

public class BecInteligent implements IDispozitiv{
    @Override
    public void actioneaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Becul inteligent este activ.");
        System.out.println(sb.toString());
    }
}
