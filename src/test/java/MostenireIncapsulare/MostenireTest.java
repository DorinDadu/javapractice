package MostenireIncapsulare;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MostenireTest {

    @Test
    public void testautomat(){
        Audi AudiA3=new Audi("HathBack","4x4", "Integrala", 4, 5, "roz bombon", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune"),45000, "A3");

        Audi AudiA8=new Audi("Berlina", "Automata", "Integrala", 4, 5, "Rosie", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune"),37000,"A8");

        Toyota Aurris=new Toyota("Compacta","Manuala", "2x4", 4, 5,"Gri", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune"), 23000, "Aurris", "Hybrid");


        AudiA3.infoMasina();
        AudiA3.pretFinal();
        AudiA8.infoMasina();
        AudiA8.pretFinal();
        Aurris.infoMasina();
        Aurris.pretFinal();

        AudiA3.setCuloare("Gri metalizat");
        AudiA3.infoMasina();

    }
}
