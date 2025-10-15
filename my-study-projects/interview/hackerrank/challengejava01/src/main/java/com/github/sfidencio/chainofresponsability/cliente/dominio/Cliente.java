package com.github.sfidencio.chainofresponsability.cliente.dominio;

import java.math.BigDecimal;
import java.util.UUID;

public record Cliente(
        UUID id,
        String nome,
        String email,
        BigDecimal rendaMensal
) {}
