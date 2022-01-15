package ClasaAbstracta;

public class PersoanaInginerItistAbstrac extends PersoanaAbstracta{

    public String nume;
    public String prenume;

    public PersoanaInginerItistAbstrac(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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
    public void ruleazaTeste() {
        System.out.println("InginerulItist ruleaza teste");

    }
}
