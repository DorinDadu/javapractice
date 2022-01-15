package Interfata;

public class PersoanaInginerItistInterface extends Prsoanainterface implements Inginer, Itist{
    public PersoanaInginerItistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("InginerulItist proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("InginerulItist executa");

    }


    @Override
    public void scrieCod() {
        System.out.println("InginerulItist scrie cod");

    }


    @Override
    public void ruleazacCod() {
        System.out.println("InginerulItist executa cod");

    }

}

