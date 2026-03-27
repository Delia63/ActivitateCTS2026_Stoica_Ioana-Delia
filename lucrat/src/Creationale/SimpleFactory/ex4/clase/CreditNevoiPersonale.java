package Creationale.SimpleFactory.ex4.clase;

public class CreditNevoiPersonale implements Credit{
    private String numeClient;
    private Double sumaCredit;

    public CreditNevoiPersonale(String numeClient, Double sumaCredit) {
        this.numeClient = numeClient;
        this.sumaCredit = sumaCredit;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientul ").append(this.numeClient)
                .append(" are un credit de nevoi personale cu suma de ")
                .append(this.sumaCredit).append(" lei");
        System.out.println(sb.toString());
    }
}
