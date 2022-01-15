package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;

public class CursantTest {
    @Test
    public void testautomat() {
        Cursant DorinPuscasu=new Cursant("Puscasu", "Dorin", 51, 2.550, 'M', true, Arrays.asList("Automation", "Manual","DataBase"));
        DorinPuscasu.dateCursant();
        System.out.println("---obiectul---");
        DorinPuscasu.prenume="Dadu";

        System.out.println("---obiectul2---");
        Cursant ManolacheMariCarmen= new Cursant("Manolache", "MariCarmen", 28, 2.550,  'F', true, Arrays.asList("Automation", "Manual", "DataBase"));
        ManolacheMariCarmen.dateCursant();
        ManolacheMariCarmen.verificadiploma();

        System.out.println("---obiectul3---");
        Cursant MareleAlb=new Cursant("Marele", "Alb", 300, 'N', true, Arrays.asList("prohod", "Nunta"));
        MareleAlb.dateCursant();
        System.out.println("Dorha Alex");
        Cursant DorhaAlex=new Cursant("Dorha", "Alex", 27, 'M', true, "Automation");
        DorhaAlex.dateCursant();

    }
}
