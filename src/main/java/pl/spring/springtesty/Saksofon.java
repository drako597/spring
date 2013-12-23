/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.spring.springtesty;

/**
 *
 * @author karol
 */
public class Saksofon implements Instrument {

    @Override
    public void graj() {
       System.out.print("tru tru tru");
    }

    @Override
    public String getNameInstrument() {
        return "Saksofon";
    }
    
}
