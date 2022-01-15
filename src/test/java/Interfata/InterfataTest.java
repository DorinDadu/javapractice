package Interfata;

import org.junit.Test;

public class InterfataTest {
    @Test

    public void testAutomat(){
        PrsoanaInginerInterface Dorin=new PrsoanaInginerInterface("Puscasu", "Dorin");
        Dorin.proiecteaza();
        Dorin.executie();
        PersoanaItistInterface Florin=new PersoanaItistInterface("Coltescu", "Florin");
        Florin.scrieCod();
        Florin.ruleazacCod();
        PersoanaInginerItistInterface Superman=new PersoanaInginerItistInterface("Superman", "Vasile");
        Superman.executie();
        Superman.proiecteaza();
        Superman.scrieCod();
        Superman.ruleazacCod();
        //4 concepte Inheritance, Encapsulation, Polymorfism, data abstraction

    }

}