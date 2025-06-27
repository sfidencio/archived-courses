import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

public class ExplorandoProperties2 {
    private static Logger log = Logger.getLogger(ExplorandoProperties2.class.getName());

    public static void main(String[] args) {
        try {
            //Criando um arquivo de propriedades para guardar por exemplo parametros do usuario
            Properties properties = new Properties();
            properties.setProperty("ultimoUsuarioLogado","fulano");//poderia substituir o hardcode por uma variavel
            properties.setProperty("tokenJWT","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...");//poderia substituir o hardcode por uma variavel
            //...e assim por diante
            //Gravando em disco no formato XML
            properties.storeToXML(new FileOutputStream("config.xml"),"parametros");
            //Gravando em formato properties
            properties.store(new FileWriter("config.properties"),"parametros");
            //Checando se os arquivos foram criados
            File fileXML =new File("config.xml"); //Fazer o mesmo para o outro arquivo
            if(fileXML.exists())
                log.info("Arquivo criado com sucesso!");


            //Lendo o arquivo
            Properties propertiesLeitura = new Properties();
            propertiesLeitura.load(new FileReader("config.properties"));
            String ultimoUsuarioLogado = propertiesLeitura.get("ultimoUsuarioLogado").toString();
            String tokenJWT = propertiesLeitura.get("tokenJWT").toString();
            System.out.println(String.format("%s - %s",ultimoUsuarioLogado,tokenJWT));

        } catch (Exception ex) {
            //Uma exceção checked do tipo IOException cuja classe pai é Exception, poderá ser desencadeada e polimorficamente pode entrar no fluxo "catch"
            log.fine(ex.getMessage());
        }
    }
}
