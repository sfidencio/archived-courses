package br.com.github.sfidencio.curso.alura.service;

import br.com.github.sfidencio.curso.alura.model.Cliente;
import br.com.github.sfidencio.curso.alura.model.ComponentesDoCalculo;
import br.com.github.sfidencio.curso.alura.model.ErroCalcularImpostoException;
import br.com.github.sfidencio.curso.alura.model.Tributavel;
import org.jetbrains.annotations.NotNull;

/**
 * @author sfidencio
 * @version 1.0
 * @since 01/08/2022
 *
 * Classe responsavel por realizar calculo de imposto.
 *
 */
public class CalculoLimite {

    public double calcularImposto(Tributavel tributavel,ComponentesDoCalculo componentesDoCalculo) {
        return tributavel.calcular(componentesDoCalculo);
    }

    /**
     * Calcula Tributo
     * @param tributavel
     * @return double
     * @throws Exception
     */
    public double calcularImposto(@NotNull Tributavel tributavel) throws ErroCalcularImpostoException {
        return tributavel.calcular();
    }

}
