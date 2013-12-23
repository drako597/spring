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
public class żągler implements Uczestnik{
    
    int x=4;

    public żągler() {
    }
    public żągler(int x) {
        this.x=x;
    }
    
    

    @Override
    public void rozpocznijPokaz() {
        System.out.println("Żągluję:"+x+"piłeczkami");
    }
    
}
