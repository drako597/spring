/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.sspringintegratiospringtestyjava.util.Collection;

/**
 *
 * @author karol
 */
public class CzłowiekOrkiestra implements Uczestnik{
    
    private Collection<Instrument> listaInstrumentow;

    @Override
    public void rozpocznijPokaz() {
       System.out.print("Gram na:");
    }
    
}
