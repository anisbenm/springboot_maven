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

/**
 *
 * @author Administrateur
 */
public interface ClientDAOServiceCrud extends CrudRepository<Client,Long>{
    public List<Client> findByNom(String s);
    public Client findOneByReservationsId(long id);
}
