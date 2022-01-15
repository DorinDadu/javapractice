package ClasaAbstracta;

import org.junit.Test;

public class AbstractTest {

    @Test
    public void testAutomat(){
        PersoanaInginerAbstract Dorin=new PersoanaInginerAbstract("Puscasu", "Dorin");
        Dorin.proiecteaza();
        Dorin.executie();
        Dorin.afisazaVarsta(52);
        PersoanaItistAbstracta Florin=new PersoanaItistAbstracta("Coltescu", "Florin");
        Florin.scrieCod();
        Florin.ruleazaTeste();
        Florin.afisazaVarsta(24);
        PersoanaInginerItistAbstrac Superman=new PersoanaInginerItistAbstrac("Superman", "Vasile");
        Superman.proiecteaza();
        Superman.executie();
        Superman.scrieCod();
        Superman.ruleazaTeste();
        Superman.afisazaVarsta(32);

    }
}
