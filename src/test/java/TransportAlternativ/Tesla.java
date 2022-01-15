package TransportAlternativ;


import java.util.List;

public class Tesla extends Trotinete {
    private String model;
        private List<String>dotariExtra;
        private Integer pret;


        public Tesla(String producator, String culoare, Integer numarRoti, Integer andeFabricatie, String model, List<String>dotariExtra, Integer pret) {
            super(producator, culoare, numarRoti, andeFabricatie);
            this.model=model;
            this.dotariExtra=dotariExtra;
            this.pret=pret;


        }

        public void pretFinal(){
            Integer pretFinal = pret;
            Integer index = 0;
            while (index < dotariExtra.size()) {
                if (dotariExtra.get(index).equals("frana pe disc")) {
                    pretFinal = pretFinal + 100;
                }
                if (dotariExtra.get(index).equals("semnalizatoare")) {
                    pretFinal = pretFinal + 100;
                }
                if (dotariExtra.get(index).equals("motor electric")) {
                    pretFinal = pretFinal + 1500;
                }
                index++;
            }
                System.out.println("Pretul final al trotinetei Tesla model" + model + " este de " + pretFinal +  "EUR");


        }

        public void infoTrotineta(){

            System.out.println("Detaliile despre trotineta " + model + " sunt urmatoarele:");
            System.out.println(toString());
        }

    @Override
    public String toString() {
        return "Tesla{" +
                "model='" + model + '\'' +
                "culoare='" + getCuloare() + '\'' +
                "numarRoti='" + getNumarRoti() + '\'' +
                ", dotariExtra=" + dotariExtra +
                ", pret=" + pret +
                '}';
    }
}

