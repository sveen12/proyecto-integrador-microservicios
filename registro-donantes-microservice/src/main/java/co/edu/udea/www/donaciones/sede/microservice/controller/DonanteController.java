/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.sede.microservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import co.edu.udea.www.donaciones.sede.microservice.model.Donante;
import co.edu.udea.www.donaciones.sede.microservice.repo.DonanteRepository;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by wonwoo on 2016. 3. 7..
 */
@Slf4j
@RestController
public class DonanteController {

    @Autowired
    private DonanteRepository repository;

    @RequestMapping(value = "/donante", method = RequestMethod.GET)
    public ResponseEntity<?> getDonante() {
        List<Donante> accounts = repository.findAll();
        //log.debug("accounts : {} ", accounts);
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/donante",method = RequestMethod.POST)
    public Donante create(@RequestBody Donante donante) {
        Donante result = repository.save(donante);
        return result;
    }
}
