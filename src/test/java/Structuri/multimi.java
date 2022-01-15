package Structuri;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class multimi {


    @Test
    public void testautomat() {
        //multiminumereArray();
        //multimiprenumeinArray();
       // multimiprenumelist();
        //multimevaloriHashMap();
        multimitariorase();


    }

    public void multiminumereArray() {

        Integer[] numere = new Integer[3];
        numere[0] = 5;
        numere[1] = 6;
        numere[2] = 7;
        for (Integer index = 0; index < numere.length; index++) {
            System.out.println(numere[index]);
        }
    }

    public void multimiprenumeinArray() {
        String[] prenume = new String[3];
        prenume[0] = "Dorin";
        prenume[1] = "Claudia";
        prenume[2] = "Bianca";
        for (Integer index = 0; index < prenume.length; index++) {
            System.out.println(prenume[index]);
        }

    }

    public void multimiprenumelist() {

        List<String> prenume = new ArrayList<>();
        prenume.add("Dorin");
        prenume.add("Claudia");
        prenume.add("Bianca");
        for (Integer index = 0; index < prenume.size(); index++) {
            System.out.println(prenume.get(index));

        }

    }

    public void multimevaloriHashMap() {

        //HashMap functioneaza dupa logica de key=value
        HashMap<String, String> obiectediferite = new HashMap<>();
        obiectediferite.put("fruct", "mar");
        obiectediferite.put("leguma", "morcov");
        obiectediferite.put("haina", "bluza");
        for (String key : obiectediferite.keySet()) {
            System.out.println("cheia este " + key);
            System.out.println("valoarea este " + obiectediferite.get(key));

        }
        Object firstKey= obiectediferite.keySet().toArray()[0];
        Object valueForFirstKey=obiectediferite.get(firstKey);
        System.out.println("prima cheie este "+firstKey.toString());
        System.out.println("prima valoare este "+valueForFirstKey);
    }


    public void multimitariorase(){

        List<String>oraseromania= new ArrayList<>();
        oraseromania.add("Bucuresti");
        oraseromania.add("Cluj");
        oraseromania.add("Iasi");
        List<String>orasespania= new ArrayList<>();
        orasespania.add("Madrid");
        orasespania.add("Barcelona");
        oraseromania.add("Malaga");
        orasespania.add("Valencia");
        HashMap<String,List>tariorase=new HashMap<>();
        tariorase.put("Romania", oraseromania);
        tariorase.put("Spania", orasespania);

        for (String key : tariorase.keySet()) {
            System.out.println("tara este " + key);
            System.out.println("orasul este " + tariorase.get(key));

        }
    }


}