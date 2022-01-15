package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {

    @Test
    public void testAutomat(){

        Caine Labrador=new Caine("Labrador retriever", "medie", "Neagra");
        Labrador.scoateSunet();
        Labrador.apeleazaMetodaParinte();
        Labrador.cumparaProduse();
        Labrador.cumparaProduse("Lesa");
        Labrador.cumparaProduse(2);
        System.out.println(Labrador.culoareBlana);
    }
    //Metoda return putem aplica polimorfismul dinamic
    //Metoda return=putem aplica poliformismul static doar la nivel de numarul de parametrii

}
