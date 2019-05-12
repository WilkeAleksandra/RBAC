/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BiletDAO;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aleksandra
 */

@RestController
public class biletController {
    
    @Autowired BiletDAO biletDAO;
    
    @RequestMapping(value="/bilety", method=RequestMethod.POST)
    public ResponseEntity<Object> createBilet(@RequestBody Bilet bilet){
        biletDAO.createBilet(bilet);
        return new ResponseEntity<>("Bilet stworzony pomyslnie", HttpStatus.OK);
    }
    
    @RequestMapping(value="/bilety", method=RequestMethod.GET)
    public ResponseEntity<Object> getBilet(){
        return new ResponseEntity<>(biletDAO.getBilety(), HttpStatus.OK);
    }
}
