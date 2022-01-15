package VariabilaMetoda;

import org.junit.Test;

public class Exercitiu {


    public String nume;
    public String prenume;
    public String datanasterii;
    public String adresa;
    public String adresanumar;
    public String localitate;
    public String judet;
    public String telefon;
    public String email;


    @Test
    public void login(){
        nume="Puscasu";
        prenume="Dorin";
        datanasterii="14.01.1970";
        adresa="Moise Nicoara";
        adresanumar="7A";
        localitate="Cluj-Napoca";
        judet="Cluj";
        telefon="0740060532";
        email="puscasu.dorin@gmail.com";
        System.out.print(nume+" ");
        System.out.println(prenume);
        System.out.println(datanasterii);
        System.out.println(adresa);
        System.out.println(adresanumar);
        System.out.println(localitate);
        System.out.println(judet);
        System.out.println(telefon);
        System.out.println(email);

    }
}
