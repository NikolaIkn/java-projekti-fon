/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author Nikola Ikonic
 */
public class Anganzman extends OpstiDomenskiObjekat{
    private Posao posao;
    private Vozilo vozilo;

    public Anganzman(Posao posao, Vozilo vozilo) {
        this.posao = posao;
        this.vozilo = vozilo;
    }

    public Posao getPosao() {
        return posao;
    }

    public void setPosao(Posao posao) {
        this.posao = posao;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }
    
    
}
