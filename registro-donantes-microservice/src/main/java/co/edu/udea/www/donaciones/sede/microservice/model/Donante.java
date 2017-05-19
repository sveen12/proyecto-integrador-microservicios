/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.sede.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Donante {

    @Id
    private String documento;
    private String direccion;
    private String edad;
    private String estadoCivil;
    private String estadoSalud;
    private String nombres;
    private String apellidos;
    private String rh;

    public Donante(String documento, String direccion, String edad, String estadoCivil, String estadoSalud, String nombres, String apellidos, String rh) {
        this.documento = documento;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estadoSalud = estadoSalud;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rh = rh;
    }
}
