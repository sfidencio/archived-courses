package com.github.sfidencio.chainofresponsability.cliente;

import com.github.sfidencio.chainofresponsability.cliente.dominio.Cliente;
import com.github.sfidencio.chainofresponsability.cliente.rules.ClienteValidationUseCase;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    final static ClienteValidationUseCase clienteValidationUseCase = new ClienteValidationUseCase();

    static void main() {
        System.out.println("Clientes v1.0");
        while (true) {
            try {
                exibirMenu();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("============================");
        System.out.println("\uD83D\uDC64 1 - Cadastrar cliente");
        System.out.println("\uD83D\uDCCB 2 - Listar clientes");
        System.out.println("\u274C 0 - Sair");
        System.out.println("============================");
        System.out.print("\uD83D\uDD22  Digite a Opção: ");
        String opcaoStr = scanner.nextLine();
        int opcao;
        try {
            opcao = Integer.parseInt(opcaoStr);
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida!");
            exibirMenu();
            return;
        }
        if (opcao == 1) {
            cadastrar();
        } else if (opcao == 2) {
            exibirListaClientes();
        } else if (opcao == 0) {
            System.out.println("Saindo...");
            System.exit(0);
        } else {
            System.out.println("Opção inválida!");
            exibirMenu();
        }
    }

    private static void cadastrar() {
        System.out.println("============================");
        System.out.println("\uD83D\uDC64 Cadastro de cliente");
        System.out.println("============================");
        System.out.print("\uD83D\uDC68\u200D\uD83D\uDCBB Nome: ");
        String nome = scanner.nextLine();
        System.out.print("\uD83D\uDCE7 Email: ");
        String email = scanner.nextLine();
        System.out.print("\uD83D\uDCB0 Renda: ");
        String rendaStr = scanner.nextLine().replace(",", ".");
        BigDecimal renda;
        try {
            renda = new BigDecimal(rendaStr);
        } catch (NumberFormatException e) {
            renda = BigDecimal.ZERO;
        }
        var cliente = new Cliente(UUID.randomUUID(), nome, email, renda);
        clienteValidationUseCase.save(cliente);
        System.out.println("\u2705 Cliente cadastrado com sucesso!");
        System.out.println("============================");
    }

    public static void exibirListaClientes() {
        System.out.println("============================");
        System.out.println("\uD83D\uDCCB Lista de clientes");
        System.out.println("============================");
        if (clienteValidationUseCase.getDbfake().isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.printf("%-20s | %-25s | %-10s\n", "Nome", "Email", "Renda");
            System.out.println("---------------------+---------------------------+------------");
            clienteValidationUseCase.getDbfake().forEach(
                    c -> System.out.printf("%-20s | %-25s | %10.2f\n", c.nome().toUpperCase(), c.email().toLowerCase(), c.rendaMensal())
            );
        }
        System.out.println("============================");
    }

}