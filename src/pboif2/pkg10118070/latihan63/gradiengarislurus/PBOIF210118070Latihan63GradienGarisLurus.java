/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan63.gradiengarislurus;

/**
 *
 * @author Ailyasha
 */
public class PBOIF210118070Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat= new Koordinat (2,10,5,7);
        Koordinat koordinat2= new Koordinat (5,1,3,12);
        System.out.println(koordinat.hitungGradien());
        System.out.println(koordinat2.hitungGradien());
        
    }
    
}
