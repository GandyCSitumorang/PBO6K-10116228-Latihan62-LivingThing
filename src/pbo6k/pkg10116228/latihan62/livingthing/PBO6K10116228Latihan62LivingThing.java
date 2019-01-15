/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan62.livingthing;
/**
/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripi Program : program ini berisi program yang berisi tentang livingthing
 *                   seseorang
 */
public class PBO6K10116228Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Gandy Christian Situmorang");
       
        human.walk(human.getNama());
        human.Breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
