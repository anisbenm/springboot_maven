/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrateur
 */
@Component
public class B {
    @Autowired
    private C c;

    public void setC(C c) {
        this.c = c;
    }

    public C getC() {
        return c;
    }
    
    
}
