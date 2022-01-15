package ClasaAbstracta;

public class PersoanaItistAbstracta extends PersoanaAbstracta{

    public String nume;
    public String prenume;

    public PersoanaItistAbstracta(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {

    }

    @Override
    public void executie() {

    }

    @Override
    public void scrieCod() {
        System.out.println("Itistul scrie cod");

    }

    @Override
    public void ruleazaTeste() {
        System.out.println("Itistul ruleaza teste");

    }
}
