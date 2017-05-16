/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Hotel;

/**
 *
 * @author Administrateur
 */
//pas besoin de @repesitory extends
public interface HotelDaoServiceCrud extends CrudRepository<Hotel, Long>{
    public Hotel findOneByNom(String s);// Spring crer la fonction autom//par defaut transactionnel //liée HotelserviceCrudTest
    public List<Hotel> findByLocalite(String s);
}
