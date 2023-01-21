package projeto_final;

import projeto_final.entidades.Aluguel;
import projeto_final.entidades.Cliente;
import projeto_final.entidades.Veiculo;
import projeto_final.sistemas.SistemaRegistro;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaRegistro regSys = new SistemaRegistro();

        System.out.println("LOCAÍ-JÁ - Sistema de locação de veículos");
        Cliente cliente = regSys.cadastrarCliente(sc);
        Veiculo veiculo = regSys.selecionaVeiculo(sc);
        int diasLocacao = regSys.diasLocacao(sc);

        Aluguel.calcularAluguel(veiculo,cliente,diasLocacao);

    }
}
