package VariabilaMetoda;

import org.junit.Test;

public class Cursant {

    //Am facut un comentariu
    //Clasa=un sablon de variabile si metode
    //Variabila=atributul unei clase
    //Metoda=actiunea unei clase
    //Tot timpul o clasa va avea langa nume cuvantul "class"
    //O clasa trebuie sa aiba un nume
    //O clasa trebuie sa fie publica=>inseamna ca oricine poate sa vada clasa respectiva
    //Variabila=poate sa fie de doua tipuri:globala sau locala
    //Variabila globala= este vizibila peste tot in clasa
    //Variabila globala structura=public tipVariabila Nume Variabila
    //Variabila locala= este vizibila doar in locul unde am scris
    //Variabila locala structura=TipVariabila NumeVariabila
    //O variabila poate sau nu sa primeasca o valoare
    //Ca sa dam o valoare la o variabila se face cu =
    //Metodele sunt de doua feluri: void si return
    //Metoda void structura= public void numemetoda(){}
    //Metoda return structura= public tipvariabila numemetoda() (adaug un get la nume)

    public String nume;
    public String prenume;
    public String adresa;
    public Integer adresaNumar;
    public Integer varsta;
    public Double kg;
    public Double experienta;

    @Test
    public void testautomat(){
      inscrierecurs();
      platestetaxa();
      calculeazasuma();
      System.out.println(getsalar());
      System.out.println(getadresa());
      System.out.println(getAdresaNumar());

    }
    public void inscrierecurs(){
        nume="Dorin";
        prenume="Dadu";
        adresa="Moise Nicoara";
        adresaNumar=7;
        varsta=51;
        kg=110.5;
        experienta=1.5;

        //Afisam o valoare in consola
        //Print=Printeaza si ramane cu cursorul pe linia curenta
        //Println=Printeaza si dupa trece cu cursorul la linia urmatoare
        System.out.print(nume+" ");
        System.out.println(prenume);
        System.out.println(adresa+" "+adresaNumar);
        System.out.println(varsta);
        System.out.println(kg);
        System.out.println(experienta);


    }
    public void platestetaxa(){
        nume="Dorin";
        prenume="Dadu";
        //Declaram si initializam o variabila locala
        double taxa=2.500;
        inscrierecurs();
        System.out.println("cursantul cu numele:"+nume+" si prenumele:"+prenume+" a platit suma de "+String.format("%.3f",taxa));
    }

    public void calculeazasuma() {
        //calculam 3 variabile sa fie 100
        Integer suma = 0;
        Integer valoarea1=30;
        Integer valoarea2=30;
        Integer valoarea3=40;
        suma=valoarea1+valoarea2+valoarea3;
        System.out.println("suma celor 3 variabile este "+suma);

    }

    public Double getsalar(){
        Double salar=2.200;
        return salar;
    }

    public String getadresa(){
        String adresa= "Moise Nicoara";
        return adresa;
    }
    public Integer getAdresaNumar(){
        Integer AdresaNumar=7;
        return AdresaNumar;
    }


}




