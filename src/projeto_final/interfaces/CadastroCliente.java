package projeto_final.interfaces;

import projeto_final.entidades.Cliente;

import java.util.Scanner;

public interface CadastroCliente {

    Cliente cadastrarCliente(Scanner sc);

    void definirTipoCliente(Cliente cliente,String id);

}
