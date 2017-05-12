/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Client;
import streaming.service.ClientService;
import streaming.spring.SpringConfig;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class ClientServiceTest {

    @Autowired
    private ClientService ser;

    @Before
    public void init() {

        ser.supprimeTout();
        Client a = new Client();
        a.setNom("BEN MOUSSA");
        a.setPrenom("Chouayb");
        a.setId(1);
        ser.ajouter(a);
        Client b = new Client();
        b.setNom("MOUSSA");
        b.setPrenom("Anis");
        b.setId(2);
        ser.ajouter(b);
        Client c = new Client();
        c.setNom("NEFOUSSI");
        c.setPrenom("Souhil");
        c.setId(3);
        ser.ajouter(c);
    }

    @Test
    public void verifId() {
        Client cl = ser.recherer(1);
        Assert.assertEquals("BEN MOUSSA", cl.getNom());
    }

    @Test
    public void verifNb() {
        int count = ser.lister().size();
        Assert.assertEquals(3, count);
    }
}
