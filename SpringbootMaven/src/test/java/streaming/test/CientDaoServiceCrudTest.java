/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Client;
import streaming.entity.Hotel;
import streaming.service.ClientDAOServiceCrud;
import streaming.spring.SpringConfig;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class CientDaoServiceCrudTest {
    @Autowired
    ClientDAOServiceCrud serDaoCrud;
    
    @Before
    public void init() {

        serDaoCrud.deleteAll();
        Client a = new Client();
       
        a.setNom("Samba");
        a.setPrenom("SySy");
        serDaoCrud.save(a);
    }       
    @Test
    public void verifNbClientsParNom() {
        List<Client> li=serDaoCrud.findByNom("Samba");
        Assert.assertEquals(1, li.size());
    }
        @Test
    public void chercheClientParReservationId() {
        Client c=serDaoCrud.findOneByReservationsId(1);
            System.out.println("streaming.test.CientDaoServiceCrudTest.chercheClientParReservationId()"+ c);
    }
}
