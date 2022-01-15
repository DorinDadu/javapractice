package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //Doua tipuri de structuri= structuri alternative si repetitive.
    //Structura alternativa= if conditie then
    //                                   else
    //Nu e neaparat nevoie sa facem un else la if
    //Putem avea oricate if este nevoie

    @Test
    public void testautomat(){
     verificanumere();
     verificanume();
     verificanumerecomplex(5,3);
     verificanumerecomplex(10,12);
     verificanumerecomplex(5,5);
    }

    //Verificam daca 5 este mai mare ca 3 5>3
    public void verificanumere(){
        if (5<3){
            System.out.println("5 este mai mare ca trei");
        }
        else {
            System.out.println("5 nu este mai mic ca 3");
        }
    }

    //Verificam daca Alexandru contine Alex
    public void verificanume(){
        String nume="Alexandru";
        String numecomparatie="Gherghe";
        if (nume.contains(numecomparatie)){
            System.out.println("Alexandru contine Alex");
        }
        else {
            System.out.println("numele Alexandru nu contine cealalta valoare");
        }
    }


    //Verificam daca un numar e mai mare ca altul cu mai multe cazuri
    public void verificanumerecomplex(Integer nr1,Integer nr2) {
        if (nr1>nr2){
            System.out.println(nr1+ "este mai mare ca" +nr2);
        }
        if (nr1<nr2){
            System.out.println(nr1+ "este mai mic ca" +nr2);
        }
        if (nr1==nr2){
            System.out.println(nr1+ "este egal cu" +nr2);

        }
        if (nr1!=nr2){
            System.out.println(nr1+ "este diferit de" +nr2);
        }

    }
}


