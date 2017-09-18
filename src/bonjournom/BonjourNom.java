/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;

import aleatoire.Person;

/**
 *
 * @author sergesdoumo
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("My first netbeans program");
        
       Person Doumo = new Person("Doumo", "Serges",33);
       
       System.out.println(Doumo.getLastName());
       
       System.out.println(Doumo.getFirstName());
       
       System.out.println(Doumo.getAge());
       
       Doumo.setAge(35);
       
       Doumo.setLastName("Doumo Doumo");
       
       System.out.println(Doumo.getLastName());
       
       System.out.println(Doumo.getAge());
       


       
       


    }
    
}
