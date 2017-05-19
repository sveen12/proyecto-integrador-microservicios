/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.microservice.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.udea.www.donaciones.microservice.model.Donacion;
/**
 *
 * @author Lenovo
 */
public interface DonacionRepository extends MongoRepository<Donacion, String> {

}