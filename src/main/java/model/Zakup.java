/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Aleksandra
 */
public class Zakup {
    private int id;
    private Date data;
    private String rodzajPlatnosci;
    private int Cena;
    private String stanowisko;
    private int nrPracownika;

    public Zakup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRodzajPlatnosci() {
        return rodzajPlatnosci;
    }

    public void setRodzajPlatnosci(String rodzajPlatnosci) {
        this.rodzajPlatnosci = rodzajPlatnosci;
    }

    public int getCena() {
        return Cena;
    }

    public void setCena(int Cena) {
        this.Cena = Cena;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getNrPracownika() {
        return nrPracownika;
    }

    public void setNrPracownika(int nrPracownika) {
        this.nrPracownika = nrPracownika;
    }
    
    
}
