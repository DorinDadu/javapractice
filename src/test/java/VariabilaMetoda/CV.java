package VariabilaMetoda;

import org.junit.Test;

public class CV {

    public String nume;
    public String prenume;
    public String porecla;
    public String datanasterii;
    public String adresa;
    public String adresaNumar;
    public String email;
    public String studii;
    public String premii;
    public String hobby;


    @Test
    public void CV(){
        nume="TOF";
        prenume="Caruso";
        porecla="Groot";
        datanasterii="18.06.2018";
        adresa="Moise Nicoara";
        adresaNumar="7A";
        email="TOFcaruso.groot@dogmail.com";
        studii="DogMastertrainingschool";
        premii="ROJChampion, ROChampion";
        hobby="inot, excursii";
        System.out.print(nume);
        System.out.println(prenume);
        System.out.println(porecla);
        System.out.println(datanasterii);
        System.out.println(adresa);
        System.out.println(adresaNumar);
        System.out.println(email);
        System.out.println(studii);
        System.out.println(premii);
        System.out.println(hobby);
    }


}
