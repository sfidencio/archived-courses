package principal;

import modelo.empresa.Funcionario;
import modelo.empresa.Gerente;

public class TesteFuncionarioHerancaReferenciasEmpresa {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        //Nao tenho acesso mais ao metodo autentica, pq
        //g1 é uma ref do tipo Funcionario e nao Gerente
        //g1.autentica(222);
        //Logo para eu acessar, farei um casting
        Gerente g1Convertido = ((Gerente) g1);
        g1Convertido.setSenha(1234);
        System.out.println("Senha correta? " + g1Convertido.autentica(1234));

    }
}
