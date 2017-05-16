package streaming.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.component.A;
import streaming.spring.SpringConfig;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class ComponentTest {

    @Autowired
    private A monA;

    @Test
    public void testBNotNull() {
        Assert.assertNotNull(monA.getB());
    }

    @Test
    public void testANotNull() {
        Assert.assertNotNull(monA);
    }

    @Test
    public void testCNotNull() {
        Assert.assertNotNull(monA.getB().getC() );
    }
}
