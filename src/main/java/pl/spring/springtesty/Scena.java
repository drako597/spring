/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.spring.springtesty;

import java.util.Collection;

/**
 *
 * @author karol
 */
public class Scena {

    private Collection<Uczestnik> lisaUczestników;

    public void występ() {
        for (Uczestnik uczestnik : lisaUczestników) {
            uczestnik.rozpocznijPokaz();

        }
    }

    public void setLisaUczestników(Collection<Uczestnik> lisaUczestników) {
        this.lisaUczestników = lisaUczestników;

    }

    public void init() {
        System.out.println("Start:");
    }

    public void destroy() {
        System.out.println("Stop!!");
    }

}
