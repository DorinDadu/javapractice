package Protected;

public class Copil {
    //Public vizibil peste tot
    //Private vizibil doar in clasa in care ai declarat
    //Protected vizibil in clasa parinte = clasa copil indiferent daca se afla sau nu in acelasi pachet
    //Default vizibil in clasa parinte+clasa copil
    //Protected = daca declaram un obiect este vizibil in orice clasa din pachet
    //Default=daca declaram un obiect este vizibil in orice clasa din pachet

    public void metodaPublica(){
        System.out.println("Public");

    }
    private void metodaPrivate(){
        System.out.println("Private");
    }
    protected void metodaProtected(){
        System.out.println("Protected");
    }
    void metodaDefault(){
        System.out.println("Default");
    }
}
