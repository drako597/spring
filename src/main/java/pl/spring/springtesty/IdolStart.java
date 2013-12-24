/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.spring.springtesty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author karol
 */
public class IdolStart {
    
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("/META-INF/spring/integration/Idol.xml");
        Scena s = (Scena)ac.getBean("scena");
        s.występ();
    }
    
}
