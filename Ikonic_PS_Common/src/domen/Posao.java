/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Nikola Ikonic
 */
public class Posao extends OpstiDomenskiObjekat{
    private Firma firma;
    private int rbPosla;
    private int cena;
    private LocalDate datumUtovara;
    private LocalDate datumIstovara;
    private Mesto mestoUtovara;
    private Mesto mestoIstovara;
    private String opis;

    public Posao(Firma firma, int rbPosla, int cena, LocalDate datumUtovara, LocalDate datumIstovara, Mesto mestoUtovara, Mesto mestoIstovara, String opis) {
        this.firma = firma;
        this.rbPosla = rbPosla;
        this.cena = cena;
        this.datumUtovara = datumUtovara;
        this.datumIstovara = datumIstovara;
        this.mestoUtovara = mestoUtovara;
        this.mestoIstovara = mestoIstovara;
        this.opis = opis;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public int getRbPosla() {
        return rbPosla;
    }

    public void setRbPosla(int rbPosla) {
        this.rbPosla = rbPosla;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public LocalDate getDatumUtovara() {
        return datumUtovara;
    }

    public void setDatumUtovara(LocalDate datumUtovara) {
        this.datumUtovara = datumUtovara;
    }

    public LocalDate getDatumIstovara() {
        return datumIstovara;
    }

    public void setDatumIstovara(LocalDate datumIstovara) {
        this.datumIstovara = datumIstovara;
    }

    public Mesto getMestoUtovara() {
        return mestoUtovara;
    }

    public void setMestoUtovara(Mesto mestoUtovara) {
        this.mestoUtovara = mestoUtovara;
    }

    public Mesto getMestoIstovara() {
        return mestoIstovara;
    }

    public void setMestoIstovara(Mesto mestoIstovara) {
        this.mestoIstovara = mestoIstovara;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.firma);
        hash = 97 * hash + this.rbPosla;
        hash = 97 * hash + this.cena;
        hash = 97 * hash + Objects.hashCode(this.datumUtovara);
        hash = 97 * hash + Objects.hashCode(this.datumIstovara);
        hash = 97 * hash + Objects.hashCode(this.mestoUtovara);
        hash = 97 * hash + Objects.hashCode(this.mestoIstovara);
        hash = 97 * hash + Objects.hashCode(this.opis);
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
        final Posao other = (Posao) obj;
        if (this.rbPosla != other.rbPosla) {
            return false;
        }
        if (this.cena != other.cena) {
            return false;
        }
        if (!Objects.equals(this.opis, other.opis)) {
            return false;
        }
        if (!Objects.equals(this.firma, other.firma)) {
            return false;
        }
        if (!Objects.equals(this.datumUtovara, other.datumUtovara)) {
            return false;
        }
        if (!Objects.equals(this.datumIstovara, other.datumIstovara)) {
            return false;
        }
        if (!Objects.equals(this.mestoUtovara, other.mestoUtovara)) {
            return false;
        }
        if (!Objects.equals(this.mestoIstovara, other.mestoIstovara)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Posao{" + "firma=" + firma + ", rbPosla=" + rbPosla + ", cena=" + cena + ", datumUtovara=" + datumUtovara + ", datumIstovara=" + datumIstovara + ", mestoUtovara=" + mestoUtovara + ", mestoIstovara=" + mestoIstovara + ", opis=" + opis + '}';
    }
    
    
}
