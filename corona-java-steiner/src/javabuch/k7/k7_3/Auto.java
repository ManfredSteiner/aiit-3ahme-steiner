/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuch.k7.k7_3;

/**
 *
 * @author steiner https://dbs.cs.uni-duesseldorf.de/lehre/docs/java/javabuch/html/k100049.html#sectlevel2id007003
 */
public class Auto {

    public String name;
    public int erstzulassung;
    public int leistung;

    public Auto () {
        // Default Konstruktor automatisch da solange kein anderer Konstruktor geschrieben wird.
    }

    // Listing 7.12
    public Auto (String name) {
        this.name = name;
    }

    // Listing 7.15
    public Auto (String name, int erstzulassung, int leistung) {
        this(name);
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
    }

    // Listing 7.8
    public int alter () {
        return 2011 - erstzulassung;
    }

    // Listing 7.9
    public void printAlter (int wieoft) {
        while (wieoft-- > 0) {
            System.out.println("Alter = " + alter());
        }
    }

    // Listing 7.11
    public int alter (String titel) {
        int alter = alter();
        System.out.println(titel + alter);
        return alter;
    }

    /*
    @Override
    protected void finalize() {
	// finalize is deprecated since Java9
	// --> nicht verwenden
    	System.out.println("Auto Destruktor");
    }
     */
    public static void main (String[] args) {
        // Listing 7.7
        Auto golf1 = new Auto();
        golf1.erstzulassung = 1990;
        System.out.println(golf1.alter());

        // Listing 7.10
        Auto auto = new Auto();
        int a = 3;
        auto.printAlter(a);
        auto.printAlter(a);
        auto.printAlter(a);

        // Listing 7.13
        Auto dasAuto = new Auto("Porsche 911");
        System.out.println(dasAuto.name);
    }

}
