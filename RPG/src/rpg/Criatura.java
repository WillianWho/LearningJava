/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;

/**
 *
 * @author willi
 */
public class Criatura implements Generica {

    //Atributos
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int magia;
    private int agilidade;
    private int destresa;
    private int inteligencia;
    private int carisma;
    private int forca;

    // metodos especiais
    //Construtor
    public Criatura(String nome, String classe, int nivel, int vida, int magia, int agilidade, int destresa, int inteligencia, int carisma, int forca) {
        this.setNome(nome);
        this.setClasse(classe);
        this.setNivel(nivel);
        this.setVida(vida);
        this.setMagia(magia);
        this.setAgilidade(agilidade);
        this.setDestresa(destresa);
        this.setInteligencia(inteligencia);
        this.setCarisma(carisma);
        this.setForca(forca);
    }

    // Metodos 
    public int atacar() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public int defesa() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public int descancar() {
        int recuperar;
        Random random = new Random();
        recuperar = random.nextInt(100);

        if (recuperar > 20) {
            this.setVida(recuperar);
            return recuperar;
        } else {
            return 0;
        }
    }

    public boolean vivo() {
        return getVida() > 0;
    }

    public void perdeVida(int dano) {
        int ataque = getVida() - dano;
        if (ataque < 0) {
            setVida(0);
        } else {
            setVida(ataque);
        }
    }
    public void revitalizar(){
        setVida(getVida()+descancar());
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getMagia() {
        return magia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getDestresa() {
        return destresa;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getForca() {
        return forca;
    }
    //Setters 

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setClasse(String classe) {
        this.classe = classe;
    }

    public final void setNivel(int nivel) {

        if (nivel > 0 && nivel <= 10) {
            this.nivel = nivel;
        }
    }

    public final void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }

    public final void setMagia(int magia) {
        if (magia > 0 && magia <= 100) {
            this.magia = magia;
        }
    }

    public final void setAgilidade(int agilidade) {
        if (agilidade > 0 && agilidade <= 12) {
            this.agilidade = agilidade;
        }
    }

    public final void setDestresa(int destresa) {
        if (destresa > 0 && destresa <= 16) {
            this.destresa = destresa;
        }
    }

    public final void setInteligencia(int inteligencia) {
        if (inteligencia > 0 && inteligencia <= 20) {
            this.inteligencia = inteligencia;
        }
    }

    public final void setCarisma(int carisma) {
        if (carisma > 0 && carisma <= 12) {
            this.carisma = carisma;
        }
    }

    public final void setForca(int forca) {
        if (forca > 0 && forca <= 32) {
            this.forca = forca;
        }
    }

    @Override
    public void call() {

    }

    @Override
    public String toString() {
        return "Criatura{" + "nome=" + nome + ", classe=" + classe + ", nivel=" + nivel + ", vida=" + vida + ", magia=" + magia + ", agilidade=" + agilidade + ", destresa=" + destresa + ", inteligencia=" + inteligencia + ", carisma=" + carisma + ", forca=" + forca + '}';
    }

    

}
