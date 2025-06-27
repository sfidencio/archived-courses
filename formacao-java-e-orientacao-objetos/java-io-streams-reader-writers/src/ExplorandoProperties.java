import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

public class ExplorandoProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("username","Fulano");
        properties.setProperty("password", "@@pass");




        properties.forEach((key,value)-> {
            System.out.println("Chave: " + key + " - Valor: " + value);
        });


        System.out.println("Gravando no disco...");
        properties.storeToXML(new FileOutputStream("configs.xml"),"xml");
        properties.store(new FileWriter("configs.properties"),"properties");
    }
}
