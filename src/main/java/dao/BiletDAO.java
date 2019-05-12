/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.*;
/**
 *
 * @author Aleksandra
 */
public interface BiletDAO {
    public abstract int createBilet(Bilet bilet);
    public abstract List<Bilet> getBilety();
}
