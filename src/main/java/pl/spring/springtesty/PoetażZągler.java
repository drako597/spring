/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.spring.springtesty;
/* @author karol
 */
public class PoetażZągler extends Żągler {
    
    private Poem poem;

    public PoetażZągler(Poem poem) {
        this.poem=poem;
    }

    public PoetażZągler(Poem poem, int x) {
        super(x);
        this.poem = poem;
    }

    @Override
    public void rozpocznijPokaz() {
        System.out.println("Żągluję: "+x+"piłeczkami i Recytuję"+poem.getPoem());
    }
    
    
    
    
}
