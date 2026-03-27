package Creationale.SimpleFactory.ex4.clase;

public class CreditIpotecar implements Credit{
    private String numeClient;
    private Double sumaCredit;

    public CreditIpotecar(String numeClient, Double sumaCredit) {
        this.numeClient = numeClient;
        this.sumaCredit = sumaCredit;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientul ").append(this.numeClient)
                .append(" are un credit de ipotecar cu suma de ")
                .append(this.sumaCredit).append(" lei");
        System.out.println(sb.toString());
    }
}
