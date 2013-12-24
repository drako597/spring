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
public class Grajek implements Uczestnik {

    private Instrument instrument;

    public Grajek(Instrument instrument) {
        this.instrument = instrument;
    }

    public void rozpocznijPokaz() {
        System.out.println("Gram na :" + instrument.getNameInstrument());
        instrument.graj();
    }

}
