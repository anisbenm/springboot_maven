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
import streaming.dao.JournalDAO;
import streaming.dao.JournalDAOBidon;
import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
@Service
public class JournalService {
    @Autowired
    private JournalDAO jdao;
    
    @Transactional
    public void ecrire(String message,Date d){
    Journal j = new Journal();
    j.setDate(d);
    j.setMessage(message);
    jdao.ajouter(j);
    }
}
