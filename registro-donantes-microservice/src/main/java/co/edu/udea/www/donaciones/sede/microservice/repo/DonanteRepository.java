/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.sede.microservice.repo;

import co.edu.udea.www.donaciones.sede.microservice.model.Donante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wonwoo on 2016. 3. 7..
 */
@Repository
public interface DonanteRepository extends JpaRepository<Donante, String> {
}