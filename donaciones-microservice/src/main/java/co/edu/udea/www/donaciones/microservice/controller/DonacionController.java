/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.microservice.controller;

import co.edu.udea.www.donaciones.microservice.model.Donacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.edu.udea.www.donaciones.microservice.repo.DonacionRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Lenovo
 */
@RestController
@RequestMapping("/donacion")
public class DonacionController {

    @Autowired
    DonacionRepository donacionRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Donacion create(@RequestBody Donacion donacion) {
        Donacion result = donacionRepository.save(donacion);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idDonacion}")
    public Donacion get(@PathVariable String idDonacion) {
        return donacionRepository.findOne(idDonacion);
    }
    
    @RequestMapping( method = RequestMethod.GET)
    public ResponseEntity<?> getDonaciones() {
        List<Donacion> donacion = donacionRepository.findAll();
        //log.debug("accounts : {} ", accounts);
        return new ResponseEntity<>(donacion, HttpStatus.OK);
    }

}
