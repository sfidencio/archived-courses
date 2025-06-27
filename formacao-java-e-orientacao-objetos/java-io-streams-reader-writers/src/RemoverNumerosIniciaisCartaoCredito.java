import java.util.logging.Logger;

public class RemoverNumerosIniciaisCartaoCredito {
    public static Logger log = Logger.getLogger(RemoverNumerosIniciaisCartaoCredito.class.getName());

    public static void main(String[] args) {
        try {
            String cartao = "        142 5 38 7497 41 254 3      ";
            System.out.println("Número do cartão: " + manterDigitosFinais(cartao, 16));
        } catch (Exception ex) {
            log.info(ex.getMessage());
        }
    }

    public static String manterDigitosFinais(String nuCartao, int qtde) {
        nuCartao = nuCartao.trim();
        nuCartao = nuCartao.replace(" ", "");
        if (qtde < 0 || qtde > nuCartao.length())
            throw new IllegalArgumentException("Argumento qtde inválido.");
        String[] cadeia = new String[nuCartao.length()];
        for (int i = 0; i < nuCartao.length(); i++)
            cadeia[i] = ((Character) nuCartao.charAt(i)).toString();
        for (int i = 0; i < cadeia.length; i++) {
            int limite = cadeia.length - qtde;
            if (i < limite)
                cadeia[i] = "*";
        }
        return String.join("", cadeia);
    }
}
