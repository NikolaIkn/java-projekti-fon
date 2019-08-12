/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Nikola Ikonic
 */
public class Firma extends Korisnik {
    private List<Posao> poslovi;

    public Firma(String email, String lozinka, String naziv) {
        super(email, lozinka, naziv);
        this.poslovi = new ArrayList<>();
    }

    public Firma(ArrayList<Posao> poslovi, String email, String lozinka, String naziv) {
        super(email, lozinka, naziv);
        this.poslovi = poslovi;
    }

    public List<Posao> getPoslovi() {
        return poslovi;
    }

    public void setPoslovi(List<Posao> poslovi) {
        this.poslovi = poslovi;
    }
    
    public void dodajPosao(Posao posao) {
        this.poslovi.add(posao);
    }
    
    public void ukloniPosao(Posao posao) {
        this.poslovi.remove(posao);
    }
}
