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
public class PozycjaZakupu {
    private int id;
    private int ilosc;
    private int idProduktu;
    private int nrTransakcji;

    public PozycjaZakupu() {
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

    public int getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(int idProduktu) {
        this.idProduktu = idProduktu;
    }

    public int getNrTransakcji() {
        return nrTransakcji;
    }

    public void setNrTransakcji(int nrTransakcji) {
        this.nrTransakcji = nrTransakcji;
    }
    
    
}
