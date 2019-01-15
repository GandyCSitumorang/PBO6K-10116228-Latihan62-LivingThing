/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan62.livingthing;

/**
 *
 * @author MY PC
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void Breath(String nama){
        System.out.println(nama + " Bernafas ");
    }
     public void eat(String nama){
         System.out.println(nama + " Makan ");
     }   
}
