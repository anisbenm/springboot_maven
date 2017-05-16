/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.service.JournalService;
import streaming.service.MailService;
import streaming.spring.SpringConfig;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class JournalTest {

    @Autowired
    private JournalService jSer;
    @Autowired
    private MailService mSer;

    @Test
    public void testMail() {
       mSer.envoyer("Anis", "Chouayb", "Douaa", "Waffakaka a_l_ll ya waladi");
    }
}
