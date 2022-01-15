package Interfata;

public class PrsoanaInginerInterface extends Prsoanainterface implements Inginer{

    public PrsoanaInginerInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul proiecteaza");
    }

    @Override
    public void executie() {
        System.out.println("Inginerul executa");

    }
}
