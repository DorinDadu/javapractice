package MostenireIncapsulare;

import java.util.List;

public class Toyota extends Masina {

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;
    private String motorizare;


    public Toyota(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model, String motorizare ) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotari = dotari;
        this.pret = pret;
        this.model = model;
        this.motorizare=motorizare;
    }

    public void infoMasina(){
        System.out.println("Detaliile despre masina Toyota model " + model+  " sunt urmatoarele:");
        System.out.println(toString());
    }

    public void pretFinal(){
        Integer pretFinal = pret;
        Integer index = 0;
        while (index < dotari.size()){
            if(dotari.get(index).equals("interior piele")) {
                pretFinal = pretFinal + 1000;
            }
            if(dotari.get(index).equals("volan incalzit")) {
                pretFinal = pretFinal + 500;
            }
            if(dotari.get(index).equals("ventilatie scaune")) {
                pretFinal = pretFinal + 1000;
            }
            if (dotari.get(index).equals("motorizare")){
                pretFinal = pretFinal + 1500;
            }
            index++;
            System.out.println("Pretul final al masinii Toyota model " + model + " este de " + pretFinal + " EUR.");
        }
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getUsi() +
                ", culoare='" + culoare + '\'' +
                ", dotari=" + dotari +
                ", pret=" + pret +
                ", model='" + model + '\'' +
                ", motorizare='" + motorizare + '\'' +
                '}';
    }

}
