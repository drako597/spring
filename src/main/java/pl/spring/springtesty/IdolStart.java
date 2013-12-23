/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.sspringintegratiospringtestyorg.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author karol
 */
public class IdolStart {
    
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("/META-INF/spring/integration/Idol.xml");
        scena s = (scena)ac.getBean("scena");
        s.występ();
    }
    
}
