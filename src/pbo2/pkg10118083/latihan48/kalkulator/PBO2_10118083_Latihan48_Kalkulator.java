/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan48.kalkulator;

/**
 *
 * @author  
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas: Kalkulator
 */
public class PBO2_10118083_Latihan48_Kalkulator {

    private static double val1, val2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        val1 = kalkulator.getValue1();
        val2 = kalkulator.getValue2();
        
        System.out.println("VALUE 1 = " + val1);
        System.out.println("VALUE 2 = " + val2);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result add is = " + kalkulator.add(val1,val2));
        System.out.println("Result minus is = " + kalkulator.minus(val1, val2));
        System.out.println("Result multiple is = " + kalkulator.mutiplication(val1, val2));
        System.out.println("Result division is = " + kalkulator.division(val1, val2));
        
    }
    
}
