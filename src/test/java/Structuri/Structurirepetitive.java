package Structuri;

import org.junit.Test;

public class Structurirepetitive {

    @Test
    public void testautomat(){
        //printamnumerefor();
        printamnumerewhile();

    }

    //aici printam primele 200 de numere
    public void printamnumerefor(){
        for (Integer index=1;index<=200;index++){

            System.out.println(index);
        }
    }

    public void printamnumerewhile(){

           Integer index=1;
           while (index<=200);{
            System.out.println(index);
            index++;
        }
    }
}



