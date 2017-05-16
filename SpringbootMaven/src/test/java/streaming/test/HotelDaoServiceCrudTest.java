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
import streaming.service.ClientService;
import streaming.service.HotelDaoServiceCrud;
import streaming.spring.SpringConfig;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class HotelDaoServiceCrudTest {

    @Autowired
    private HotelDaoServiceCrud ser;

    @Before
    public void init() {

        ser.deleteAll();
        Hotel a = new Hotel();
        a.setNom("BARAKA");
        a.setLocalite("Djerba");
        ser.save(a);
        Hotel b = new Hotel();
        b.setNom("hanana");
        b.setLocalite("Djerba");
        b.setId(3L);
        ser.save(b);
    }

    @Test
    public void testHotelDaoServiceCrud() {
    }

    ////////////////
    @Test
    public void verifHotelExist() {
        Hotel h = ser.findOneByNom("BARAKA");
        Assert.assertNotNull(h);
        System.out.println("***************************" + h.getLocalite() + "******************************");

    }

    @Test
    public void verifNbHotDjerbien() {
        List<Hotel> li = ser.findByLocalite("Djerba");
        Assert.assertEquals(2, li.size());
    }

    @Test
    public void verifNomHotId3() {
        Hotel h = ser.findOne(3L);
        Assert.assertEquals("hanana", h.getNom());
    }
}
