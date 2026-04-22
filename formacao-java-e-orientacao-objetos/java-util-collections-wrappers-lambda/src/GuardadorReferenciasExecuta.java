import br.com.github.sfidencio.model.Conta;
import br.com.github.sfidencio.model.GuardadorReferencias;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GuardadorReferenciasExecuta {
    public static Logger logger = Logger.getLogger(GuardadorReferenciasExecuta.class.getName());

    public static void main(String[] args) {
        try {
            GuardadorReferencias guardadorReferencias = new GuardadorReferencias();
            guardadorReferencias.adicionar(new Conta(1, "Fulano", "11111111111"));
            guardadorReferencias.adicionar(new Conta(2, "Beltrano", "11111111111"));
            guardadorReferencias.adicionar(new Conta(3, "Ciclano", "11111111111"));
            guardadorReferencias.adicionar(new Conta(4, "Bolano", "11111111111"));
        } catch (RuntimeException ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        }
    }
}
