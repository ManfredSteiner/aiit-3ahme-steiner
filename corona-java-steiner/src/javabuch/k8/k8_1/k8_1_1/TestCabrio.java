package javabuch.k8.k8_1.k8_1_1;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steiner
 * https://dbs.cs.uni-duesseldorf.de/lehre/docs/java/javabuch/html/k100052.html#sectlevel3id008001001
 */
public class TestCabrio {
    public static void main(String[] args) {
	// Listing 8.2
	Cabrio kfz1 = new Cabrio();
	kfz1.name = "MX5";
	kfz1.erstzulassung = 1994;
	kfz1.leistung = 115;
	// kfz1.vdauer = 120;
	System.out.println("Alter = " + kfz1.alter());
    }
	    
}
