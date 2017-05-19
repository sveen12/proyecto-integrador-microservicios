/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.microservice.model;

/**
 *
 * @author Lenovo
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "donacion")
public class Donacion {

    @Id
    private String id;
    private String cantidad;
    private String tipoSangre;
    private String donante;
    private String enfermero;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     * @param tipoSangre the tipoSangre to set
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /**
     * @return the donante
     */
    public String getDonante() {
        return donante;
    }

    /**
     * @param donante the donante to set
     */
    public void setDonante(String donante) {
        this.donante = donante;
    }

    /**
     * @return the enfermero
     */
    public String getEnfermero() {
        return enfermero;
    }

    /**
     * @param enfermero the enfermero to set
     */
    public void setEnfermero(String enfermero) {
        this.enfermero = enfermero;
    }
    

}
