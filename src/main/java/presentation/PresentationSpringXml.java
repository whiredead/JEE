package presentation;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXml {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Imetier metier=(Imetier)context.getBean("metier");
        System.out.println(metier.calcul());

    }

}
