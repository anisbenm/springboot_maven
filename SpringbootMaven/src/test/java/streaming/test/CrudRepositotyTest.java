/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Client;
import streaming.spring.SpringConfig;
import streaming.service.ClientDAOServiceCrud;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class CrudRepositotyTest {

    @Autowired
    private ClientDAOServiceCrud dao;

    @Before//chaque test
    public void init() {
        dao.deleteAll();
        Client c1 = new Client();
        c1.setNom("Chouayb");
        dao.save(c1);
        Client c2 = new Client();
        c2.setNom("BEN MOUSSA");
        dao.save(c2);
    }
@Test
public void verifNbrClient(){
    Assert.assertEquals(2, dao.count());
    System.out.println("streaming.test.CrudRepositotyTest.verifNbrClient()*******************************************************************");
}
    @Test
    public void testSuprimerTous() {
        System.out.println("streaming.test.CrudRepositotyTest.testSuprimerTous()");
          dao.deleteAll();
    }

}
