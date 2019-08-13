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
public class Mesto extends OpstiDomenskiObjekat{
    private Long id;
    private String naziv;

    public Mesto(Long id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }   
    
    public Long getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.naziv);
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
        final Mesto other = (Mesto) obj;
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mesto{" + "id=" + id + ", naziv=" + naziv + '}';
    }    
    
}
