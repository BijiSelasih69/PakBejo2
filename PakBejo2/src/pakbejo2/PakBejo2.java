/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakbejo2;

/**
 *
 * @author BijiSelasih69
 */
public class PakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Keramik kA = new Keramik(30*30, 54000, 10);
        System.out.println("Total Harga Keramik A : Rp. " + kA.totalHarga());
        Keramik kB = new Keramik(40*40, 65000, 5);
        System.out.println("Total Harga Keramik B : Rp. " + kB.totalHarga());
        Keramik kC = new Keramik(30*40, 60000, 8);
        System.out.println("Total Harga Keramik C : Rp. " + kC.totalHarga());
        // TODO code application logic here
    }
    
}
