package TransportAlternativ;

public class Trotinete {
    private String producator;
    private String culoare;
    private Integer numarRoti;
    private Integer andeFabricatie;


    public Trotinete(String producator, String culoare, Integer numarRoti, Integer andeFabricatie) {
        this.producator = producator;
        this.culoare = culoare;
        this.numarRoti = numarRoti;
        this.andeFabricatie = andeFabricatie;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getNumarRoti() {
        return numarRoti;
    }

    public void setNumarRoti(Integer numarRoti) {
        this.numarRoti = numarRoti;
    }

    public Integer getAndeFabricatie() {
        return andeFabricatie;
    }

    public void setAndeFabricatie(Integer andeFabricatie) {
        this.andeFabricatie = andeFabricatie;
    }
}
