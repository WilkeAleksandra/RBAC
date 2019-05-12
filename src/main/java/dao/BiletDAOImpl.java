/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import model.Bilet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aleksandra
 */

@Repository
public class BiletDAOImpl implements BiletDAO{

    @Autowired JdbcTemplate jdbcTemplate;
    
    @Override
    public int createBilet(Bilet bilet) {
        
        KeyHolder keyHolder = new GeneratedKeyHolder();
        
        jdbcTemplate.update((Connection connection) ->{
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement("INSERT INTO BILET(nazwa, cena, ulga, idWydarzenia) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, bilet.getNazwa());
            preparedStatement.setInt(2, bilet.getCena());
            preparedStatement.setString(3, bilet.getUlga());
            preparedStatement.setInt(4, bilet.getIdWydarzenia());
            return preparedStatement;
        }, keyHolder);
        
        return keyHolder.getKey().intValue();
    }

    @Override
    public List<Bilet> getBilety() {
        List<Bilet> biletList = new ArrayList<>();
        Collection<Map<String, Object>> rows = null;
        rows = jdbcTemplate.queryForList("SELECT nazwa, cena, ulga, idWydarzenia FROM Bilet");
        rows.stream().map((row) -> {
            Bilet b = new Bilet();
            b.setNazwa((String)row.get("nazwa"));
            b.setCena((int)row.get("cena"));
            b.setUlga((String)row.get("ulga"));
            b.setIdWydarzenia((int)row.get("idWydarzenia"));
            b.setId((int)row.get("id"));
            return b;
        }).forEach((ss) -> {
           biletList.add(ss);
        });
        return biletList;
    }
    
}
