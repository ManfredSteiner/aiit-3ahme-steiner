/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k7.k7_2.k7_2_1;

import k7.k7_2.k7_2_2.Auto;

/**
 *
 * @author steiner
 * https://dbs.cs.uni-duesseldorf.de/lehre/docs/java/javabuch/html/k100048.html#sectlevel3id007002002
 */
public class TestAuto {
    
    public static void main(String[] args) {

	// Listing 7.2
	Auto meinWagen;
	meinWagen = new Auto();
	
	//Listing 7.3
	Auto meinKombi = new Auto();
	
	//Listing 7.4
	meinKombi.name = "Mercedes 600";
	meinKombi.erstzulassung = 1972;
	meinKombi.leistung = 250;
	
	//Listing 7.5 - benutze sout<Tab>
	System.out.println("Name........: " + meinKombi.name);
	System.out.println("Zugelassen..: " + meinKombi.erstzulassung);
	System.out.println("Leistung....: " + meinKombi.leistung);
    }
}
