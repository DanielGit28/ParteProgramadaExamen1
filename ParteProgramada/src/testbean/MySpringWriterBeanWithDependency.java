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
        String s = "Texto de prueba";
        System.out.println("Frase de encriptación: "+s);

        String fraseEncriptada = encripta.encripta(s);
        System.out.println("Encriptación: "+fraseEncriptada);
        String fraseDesecrinptada = encripta.desencripta(fraseEncriptada);
        System.out.println("Desencriptación: "+fraseDesecrinptada);
        System.out.println("Encriptado usado: Vignere");
    }
}
