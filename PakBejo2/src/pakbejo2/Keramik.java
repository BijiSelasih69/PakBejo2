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
public class Keramik {
    int ukuran;
    int harga;
    int isi;
    double luas = 1000000;
    
    /* constructor */
    Keramik(int u,int h,int i){
        this.ukuran = u;
        this.harga = h;
        this.isi = i;
    }
    /* non-void method */
    double luasSebox(){
        double luasSebox = this.ukuran * this.isi;
        return luasSebox;
    }
    double butuhBox(){
        double butuhBox = this.luas / luasSebox();
        return butuhBox;
    }
    double totalHarga(){
        double totalHarga = butuhBox() * this.harga;
        return totalHarga;
    }
}
