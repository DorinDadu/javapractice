package ClasaAbstracta;

public class PersoanaInginerAbstract extends PersoanaAbstracta{

    public String nume;
    public String prenume;

    public PersoanaInginerAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul proiecteaza");
    }

    @Override
    public void executie() {
        System.out.println("Inginerul executa");

    }

    @Override
    public void scrieCod() {

    }

    @Override
    public void ruleazaTeste() {

    }
}
