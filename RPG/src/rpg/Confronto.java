/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author willi
 */
public class Confronto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          super(nome, classe, nivel, vida, magia, agilidade, destresa, inteligencia, carisma, forca);
        Herois h1 = new Herois("Dark Glorisson","Humano",8,100,100,5,10,15,2,10);
        Monstro m1 = new Monstro("Montaro","Elfo das trevas",7,100,100,5,10,15,10,10);
    
    
        System.out.println(h1.toString());
        System.out.println(m1.toString());
        
        int heroiAtaque = h1.atacar();
        int monstroDefende = m1.defesa();
        
        if(heroiAtaque>monstroDefende)
        {
            m1.setVida(m1.getVida()-heroiAtaque);
            System.out.println("Ataque efetuado");
        }else{
            System.out.println("Defesa efetuada");
        }
        System.out.println(h1.toString());
        System.out.println(m1.toString());
    }
    
   
    
}
