/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.MailDAO;
import streaming.entity.Mail;

/**
 *
 * @author Administrateur
 */
@Service
public class MailService {


    @Autowired
    private MailDAO mDAO;
    @Autowired
    private JournalService jser;
    
    @Transactional    
    public void envoyer(String expi, String dest, String obj, String message) {//il faut utiliser l'entity Mail
     Mail m=new Mail();
     m.setExpediteur(expi);
     m.setDestinateur(dest);// dans le test
     m.setObjet(obj);
     m.setMessage(message);
     
     mDAO.envoyer(m);
     jser.ecrire(message, new Date());
    }

}
