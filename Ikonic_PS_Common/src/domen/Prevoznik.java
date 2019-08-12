/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikola Ikonic
 */
public class Prevoznik extends Korisnik{
    private List<Vozilo> vozila;

    public Prevoznik(String email, String lozinka, String naziv) {
        super(email, lozinka, naziv);
    }

    public Prevoznik(List<Vozilo> vozila, String email, String lozinka, String naziv) {
        super(email, lozinka, naziv);
        this.vozila = vozila;
    }

    public List<Vozilo> getVozila() {
        return vozila;
    }

    public void setVozila(List<Vozilo> vozila) {
        this.vozila = vozila;
    }
    
    public void dodajVozilo(Vozilo vozilo) {
        this.vozila.add(vozilo);
    }
    
    public void ukloniVozilo(Vozilo vozilo) {
        this.vozila.remove(vozilo);
    }
}
