/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aleksandra
 */
public class Bilet {
    private int id;
    private String nazwa;
    private int cena;
    private String ulga;
    private int idWydarzenia;

    public Bilet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getUlga() {
        return ulga;
    }

    public void setUlga(String ulga) {
        this.ulga = ulga;
    }

    public int getIdWydarzenia() {
        return idWydarzenia;
    }

    public void setIdWydarzenia(int idWydarzenia) {
        this.idWydarzenia = idWydarzenia;
    }
    
    
}
