/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.spring.springtesty;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author karol
 */
public class Żągler implements Uczestnik {

    @Value("10")
    int x = 4;

    public Żągler() {
    }
    
    public Żągler(int x) {
        this.x = x;
    }

    public void rozpocznijPokaz() {
        System.out.println("Żągluję:" + x + " piłeczkami");
    }

}
