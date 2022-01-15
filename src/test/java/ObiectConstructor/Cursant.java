package ObiectConstructor;

import java.util.List;

public class Cursant {


    //Obiect=Instanta unei clase
    //Recunoaste un obict dupa cuvantul new
    //Putem face un infinit de obiecte
    //Structura unui obiect = NumeClasa NumeObiect=new NumeClasa(se va apela constructorul clasei)(dam valori pentru variabila)
    //Exemplu obiect= Cursant DorinPuscasu=new Cursant()

    //Constructor= Are ca rol sa initializeze variabilele unei clase
    //Intr-o clasa putem avea un infinit de constructori
    //Exista doua tipuri de constructori=cu parametrii sau fara parametrii
    //Diferentierea dintre constructori se face prin tipul parametrilor si prin valoarea parametrilor
    //Daca nu fac eu un constructor este unul by default fara parametrii/
    //Structura constructor= public  numeclasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character gen;
    public Boolean diplomaBac;
    public List<String> cursuriinteres;
    public String cursinteres;


    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomaBac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursuriinteres = cursuriinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomaBac, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursinteres = cursinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomaBac, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursinteres = cursinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomaBac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursuriinteres = cursuriinteres;


    }

    public void dateCursant(){
        System.out.println("datele despre cursant sunt urmatoarele:");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if (taxa!= null){
            System.out.println(taxa);
        }
        System.out.println(gen);
        System.out.println(diplomaBac);
        System.out.println("cursurile de interes sunt urmatoarele:");
        if (cursuriinteres!= null) {
            for (Integer index = 0; index < cursuriinteres.size(); index++) {
                System.out.println(cursuriinteres.get(index));
            }
        }
        else {
            System.out.println(cursinteres);
        }
    }
    public void verificadiploma(){
        if (diplomaBac) {
            System.out.println("Cursantul"+nume+" "+prenume+" "+"are diploma de bac");
        }
        else {
            System.out.println("Cursantul"+nume+" "+prenume+" "+"nu are diploma de bac");
        }
    }
}