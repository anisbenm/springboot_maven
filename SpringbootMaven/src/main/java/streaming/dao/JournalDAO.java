/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import streaming.entity.Journal;
import streaming.entity.Mail;

/**
 *
 * @author Administrateur
 */
@Repository
public class JournalDAO {

    @PersistenceContext
    private EntityManager em;

    public void ajouter(Journal j) {
        em.persist(j);

    }
    public List<Mail> lister(){
        
    return em.createQuery("SELECT m FROM Mail m ORDER BY m.expediteur").getResultList();
    }

   public void supprimer(long id){
//   em.remove(em.find(Mail.class, id));
     em.createQuery("DELETE FROM Mail m WHERE m.id="+id).executeUpdate();
   }
   
   public void modifier(Mail m){
   em.merge(m);
   }
   
   public Mail chercher(long id){
       return (Mail) em.createQuery("SELECT m From Mail m WHERE m.id="+ id);
   }
   
   
}
