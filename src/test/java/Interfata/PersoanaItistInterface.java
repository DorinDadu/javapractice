package Interfata;

public class PersoanaItistInterface extends Prsoanainterface implements Itist{

    public PersoanaItistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scrieCod() {
        System.out.println("Itistul scrie cod");
    }

    @Override
    public void ruleazacCod() {
        System.out.println("Itistul ruleaza cod");

    }
}
