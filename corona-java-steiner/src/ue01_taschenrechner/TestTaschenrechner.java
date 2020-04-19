/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_taschenrechner;

import java.util.Scanner;

/**
 *
 * @author schueler
 */
public class TestTaschenrechner {
    
    public static void main (String[] args) {
        System.out.print("Wert a: ");
        final double a = new Scanner(System.in).nextDouble();
        System.out.print("Wert b: ");
        final double b = new Scanner(System.in).nextDouble();
        Taschenrechner tr = new Taschenrechner(a, b);
        System.out.println("  Addition: " + tr.getAdditionResult());
        System.out.println("  Subtraktion: " + tr.getSubtractionResult());
        System.out.println("  Multiplikation: " + tr.getMultiplicationResult());
        System.out.println("  Division: " + tr.getDivisionResult());
    }
    
}
