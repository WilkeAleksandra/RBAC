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
public class BiletZakup {
    private int id;
    private int ilosc;
    private int idBiletu;
    private int idZakupu;

    public BiletZakup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getIdBiletu() {
        return idBiletu;
    }

    public void setIdBiletu(int idBiletu) {
        this.idBiletu = idBiletu;
    }

    public int getIdZakupu() {
        return idZakupu;
    }

    public void setIdZakupu(int idZakupu) {
        this.idZakupu = idZakupu;
    }
    
    
}
