/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.registro.enfermero.microservice.controller;

import co.edu.udea.www.registro.enfermero.microservice.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.udea.www.registro.enfermero.microservice.repo.EmpleadoRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Lenovo
 */
@RestController
public class EmpleadoController {
        @Autowired
    private EmpleadoRepository repository;

    @RequestMapping("/")
    public String home() {
        Empleado p = this.repository.findAll().iterator().next();
        return "Hola " + p.getNombres()+ "!";
    }
    
        @RequestMapping(value = "/enfermero",method = RequestMethod.POST)
    public Empleado create(@RequestBody Empleado empleado) {
        Empleado result = repository.save(empleado);
        return result;
    }
        @RequestMapping(value = "/enfermero", method = RequestMethod.GET)
    public ResponseEntity<?> getEmpleados() {
        List<Empleado> empleados = repository.findAll();
        //log.debug("accounts : {} ", accounts);
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }
}
