/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *
 * @author willi
 */
public class Herois extends Criatura {
    
    public Herois(String nome, String classe, int nivel, int vida, int magia, int agilidade, int destresa, int inteligencia, int carisma, int forca, boolean bencao) {
        super(nome, classe, nivel, vida, magia, agilidade, destresa, inteligencia, carisma, forca, bencao);
    }
       
     @Override
    public float descancar(){
    Random random = new Random();
    int controle=0;
    float r=0;
        do{
            random.nextInt(5);
           float i=1.10f;
           
        if(i<1.66){
        r=i;
        }
        i++;
       
        }while(controle!=5);
        
        
        int bencao = isBencao()? 10:0;
        float descanco = (getVida()+ getNivel()+bencao)*r;
        return descanco;
}
}
