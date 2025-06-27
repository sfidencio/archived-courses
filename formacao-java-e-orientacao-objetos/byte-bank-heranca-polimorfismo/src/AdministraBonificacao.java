import java.util.ArrayList;
import java.util.List;

public class AdministraBonificacao {
    private List<Funcionario> registrosBonificacao = new ArrayList<>(0);

    public void registra(Funcionario f) {
        this.registrosBonificacao.add(f);
    }

    public void registra(List<Funcionario> f) {
        this.registrosBonificacao.addAll(f);
    }


    public double getTotalBonificacoes() {
        //imperativo
        /*double total = 0;
        for (Funcionario funcionario : this.registrosBonificacao)
            total += funcionario.getBonificacao();

        return  total;*/



        //Modo declarativo
        return this.registrosBonificacao.stream().mapToDouble(item -> item.getBonificacao()).sum();


    }
}
