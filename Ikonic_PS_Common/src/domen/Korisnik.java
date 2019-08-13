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
public abstract class Korisnik extends OpstiDomenskiObjekat{
    private Long id;
    private String email;
    private String lozinka;
    private String naziv;
    private boolean aktivan = true;

    public Korisnik(String email, String lozinka, String naziv) {
        this.email = email;
        this.lozinka = lozinka;
        this.naziv = naziv;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.lozinka);
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
        final Korisnik other = (Korisnik) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.lozinka, other.lozinka)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "id=" + id + ", email=" + email + ", lozinka=" + lozinka + ", naziv=" + naziv + ", aktivan=" + aktivan + '}';
    }
    
    public abstract String vratiTipKorisnika();
    
}
