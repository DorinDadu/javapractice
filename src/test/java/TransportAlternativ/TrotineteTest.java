package TransportAlternativ;

import org.junit.Test;

import java.util.Arrays;

public class TrotineteTest {

    @Test

    public void testAutomat(){

        Tesla Tesla543A= new Tesla("Tesla", "rosie", 4, 2021, "543A", Arrays.asList("frana pe disc", "semnalizatoare", "faruri led"), 1500);
        Tesla Tesla725E= new Tesla("Tesla", "albastra", 2, 2021, "725E", Arrays.asList("frana pe disc", "semnalizatoare", "faruri xenon", "motor electric"), 2500);

        Tesla543A.infoTrotineta();
        Tesla725E.infoTrotineta();
        Tesla543A.pretFinal();
        Tesla725E.pretFinal();


    }
}
