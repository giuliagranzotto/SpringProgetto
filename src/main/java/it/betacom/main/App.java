package it.betacom.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.betacom.model.Auto;
import it.betacom.model.Cliente;

public class App {

    public static void main(String[] args) {

        //Leggere file configurazione
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // per usare il mio bean lo devo andare a chiamare
        //Cliente cliente = context.getBean("cliente", Cliente.class);
        Cliente cliente =(Cliente) context.getBean("cliente");
        cliente.setNome("Mario");
        cliente.setCognome("Rossi");
        System.out.println(cliente);

        Auto auto =(Auto) context.getBean("auto");
        auto.avviaAuto();

        ((ConfigurableApplicationContext) context).close();


    }
}