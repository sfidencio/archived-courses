package br.com.sfidencio.curso.teste.automatizados;

import java.math.BigDecimal;

public enum Desempenho {
    //Strategy Pattern
    INUTIL {
        @Override
        public BigDecimal devolverPercentualReajuste() {
            throw new IllegalArgumentException("Não tem direito a reajuste!");
        }
    },
    PESSIMO {
        @Override
        public BigDecimal devolverPercentualReajuste() {
            return new BigDecimal("0.1"); //10%
        }
    },
    BOM {
        @Override
        public BigDecimal devolverPercentualReajuste() {
            return new BigDecimal("0.2"); //20%
        }
    },
    OTIMO {
        @Override
        public BigDecimal devolverPercentualReajuste() {
            return new BigDecimal("0.3"); //30%
        }
    };

    public abstract BigDecimal devolverPercentualReajuste();
}
