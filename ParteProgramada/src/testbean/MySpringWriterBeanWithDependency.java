package testbean;
import org.springframework.beans.factory.annotation.Autowired;

import Encripta.ENCRIPTA;

public class MySpringWriterBeanWithDependency {
    private ENCRIPTA encripta;
    @Autowired
    public void setEncripta (ENCRIPTA pencripta){
        this.encripta = pencripta;
    }
    public void run(){
        String s = "Sample string";
        System.out.println("Frase de encriptación: "+s);
        System.out.println("Encriptación: "+encripta.encripta(s));
        System.out.println("Desencriptación: "+encripta.desencripta(s));
        System.out.println("Encriptado usado: Cesar");
    }
}
