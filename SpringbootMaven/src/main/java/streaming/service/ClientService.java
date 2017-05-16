 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.ClientDAO;
import streaming.entity.Client;

/**
 *
 * @author Administrateur
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientDAO dao;

    public List<Client> lister() {
        return dao.lister();
    }

    @Transactional
    public void ajouter(Client c) {
        dao.ajouter(c);
    }

    @Transactional
    public void deleter(long id) {
        dao.supprimer(id);
    }

    @Transactional
    public Client recherer(long id) {
        return dao.chercher(id);
    }

    @Transactional
    public void modifier(Client c) {
        dao.modifier(c);
    }

    @Transactional
    public void supprimeTout() {
//        List<Client> clients = lister();
//        for(Client c:clients){
//            deleter(c.getId());
//        }
        dao.supprimeTout();
    }
}
