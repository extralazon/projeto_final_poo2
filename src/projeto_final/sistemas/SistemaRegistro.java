package projeto_final.sistemas;

import projeto_final.entidades.*;
import projeto_final.interfaces.CadastroCliente;
import projeto_final.interfaces.DiasLocacao;
import projeto_final.interfaces.SelecionaVeiculo;

import java.util.Scanner;

public class SistemaRegistro implements CadastroCliente, SelecionaVeiculo, DiasLocacao {

    @Override
    public Cliente cadastrarCliente(Scanner sc) {
        System.out.println("Olá, tudo bem? Por favor, informe seu nome: ");
        Cliente cliente = new Cliente(sc.nextLine());
        System.out.printf("%s, por favor digite seu CPF/CNPJ:%n",cliente.getNome());
        try {
            definirTipoCliente(cliente, sc.next());
        }catch (RuntimeException exception){
            System.out.println("Programa encerrado CPF/CNPJ inválido");
            System.exit(1);
        }
        return cliente;
    }

    @Override
    public void definirTipoCliente(Cliente cliente,String id) {
        switch (id.length()) {
            case 11 -> {
                cliente.setId(id);
                cliente.setTipo("pf");
            }
            case 14 -> {
                cliente.setId(id);
                cliente.setTipo("pj");
            }
            default -> throw new RuntimeException("informação inválida");
        }
    }

    @Override
    public Veiculo selecionaVeiculo(Scanner sc) {
        System.out.println("Selecione o tipo de veículo que deseja:");
        System.out.printf("\t[1] - Veiculo Pequeno %n\t[2] - Veiculo Medio %n\t[3] - SUV%n");
        try {
            return switch (sc.nextInt()) {
                case 1 -> new VeiculoPequeno("Uno");
                case 2 -> new VeiculoMedio("Cobalt");
                case 3 -> new VeiculoSuv("HRV");
                default -> throw new RuntimeException("opção inválida");
            };
        }catch (RuntimeException e){
            System.out.println("Programa encerrado - opção inválida");
            System.exit(1);
        }
        return null;
    }

    @Override
    public int diasLocacao(Scanner sc) {
        System.out.println("Por quantos dias deseja alugar o veículo?");
        return sc.nextInt();
    }
}
