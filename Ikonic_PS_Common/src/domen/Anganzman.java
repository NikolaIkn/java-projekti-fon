/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.posao);
        hash = 53 * hash + Objects.hashCode(this.vozilo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Anganzman other = (Anganzman) obj;
        if (!Objects.equals(this.posao.getRbPosla(), other.posao.getRbPosla())) {
            return false;
        }
        if (!Objects.equals(this.vozilo.getRegBr(), other.vozilo.getRegBr())) {
            return false;
        }
        if (!Objects.equals(this.posao.getFirma().getId(), other.posao.getFirma().getId())) {
            return false;
        }
        if (!Objects.equals(this.vozilo.getPrevoznik().getId(), other.vozilo.getPrevoznik().getId())) {
            return false;
        }
        return true;
    }   
    
}
