package defaultmethod.teste;

/*
 *
 * O que você achou dessa introdução do Java, os métodos default?
 * Qual você acha que é a grande vantagem desses métodos? O que eles possibilitam?
 *
 * Sem dúvidas um recurso bem interessante, veremos mais pra frente o quanto as novas APIs tiram proveito dele.
 * A grande vantagem é que agora uma interface pode evoluir sem quebrar compatibilidade.
 *
 */

public interface Impressora {
    void imprimir(String conteudo);

    default boolean reset(int flag) {
        if (flag == 0)
            return true;
        return false;
    }
}
