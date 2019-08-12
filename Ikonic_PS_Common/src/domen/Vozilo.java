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
public class Vozilo extends OpstiDomenskiObjekat{
    private Prevoznik prevoznik;
    private String regBr;

    public Vozilo(Prevoznik prevoznik, String regBr) {
        this.prevoznik = prevoznik;
        this.regBr = regBr;
    }

    public Prevoznik getPrevoznik() {
        return prevoznik;
    }

    public void setPrevoznik(Prevoznik prevoznik) {
        this.prevoznik = prevoznik;
    }

    public String getRegBr() {
        return regBr;
    }

    public void setRegBr(String regBr) {
        this.regBr = regBr;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.prevoznik);
        hash = 73 * hash + Objects.hashCode(this.regBr);
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
        final Vozilo other = (Vozilo) obj;
        if (!Objects.equals(this.regBr, other.regBr)) {
            return false;
        }
        if (!Objects.equals(this.prevoznik, other.prevoznik)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vozilo{" + "prevoznik=" + prevoznik + ", regBr=" + regBr + '}';
    }
    
    
}
