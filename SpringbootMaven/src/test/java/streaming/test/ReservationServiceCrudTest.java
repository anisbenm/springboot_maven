/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Reservation;
import streaming.service.ClientDAOServiceCrud;
import streaming.service.ClientService;
import streaming.service.ReservationServiceCrud;
import streaming.spring.SpringConfig;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class ReservationServiceCrudTest {
    @Autowired
    ReservationServiceCrud service;
    @Autowired
    ClientDAOServiceCrud serviceClient;
    
    @Before
    public void setUp() {
        Reservation r=new Reservation();
        r.setClient(serviceClient.findOne(1L));
                
        
    }
    @Test
    public void test(){
    //confusion
    }
}
