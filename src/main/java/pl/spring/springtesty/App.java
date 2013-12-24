package pl.spring.springtesty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Idol.xml");
        Scena s = (Scena) ac.getBean("scena");
        s.występ();
    }
}
