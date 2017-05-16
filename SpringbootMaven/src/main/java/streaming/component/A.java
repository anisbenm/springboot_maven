/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
//@Service
//@Repository Spring se comporte de la meme façon
//@Controller
@Component
public class A {
    @Autowired
    private B b;

    public B getB() {
        return b;
    }
    
}
