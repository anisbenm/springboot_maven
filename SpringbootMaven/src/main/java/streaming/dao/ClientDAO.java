/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Client;

/**
 *
 * @author Administrateur
 */
@Repository//spring tout les dao sont annoté repository
public class ClientDAO {
    
   @PersistenceContext 
   private EntityManager em;
   
   ///@Transactional**************** dans les services
   public void ajouter(Client client){
       em.persist(client);
   }
           
   public void supprimer(long id){
//       em.remove(em.find(Client.class, id));
         em.createQuery("DELETE FROM Client c WHERE c.id="+id).executeUpdate();
   }  
   public void modifier(Client client){
       em.merge(client);
   }
   
   public List<Client> lister(){
       return em.createQuery("SELECT c FROM Client c ORDER BY c.nom, c.prenom").getResultList();
   }
   
      public Client chercher(long id){
       return (Client) em.createQuery("SELECT c FROM Client c WHERE c.id="+id).getSingleResult();
   }
      
      public void supprimeTout(){
      em.createQuery("DELETE FROM Client c").executeUpdate();
      }
}
