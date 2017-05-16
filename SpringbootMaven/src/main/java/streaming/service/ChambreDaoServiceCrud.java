/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Chambre;

/**
 *
 * @author Administrateur
 */
public interface ChambreDaoServiceCrud extends CrudRepository<Chambre, Long>{
    public List<Chambre> findAllByReservationsClientNomAndReservationsClientPrenom(String n,String p);
}
