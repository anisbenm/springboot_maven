/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Client;
import streaming.entity.Reservation;

/**
 *
 * @author Administrateur
 */
public interface ReservationServiceCrud extends CrudRepository<Reservation, Long>{
    public List<Reservation> findAllByClientNomAndClientPrenom(String n,String p);// a testere
}
