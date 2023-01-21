package projeto_final.entidades;

public class Aluguel {

    public static void calcularAluguel(Veiculo veiculo, Cliente cliente,int diasAluguel){
        if(cliente.getTipo().equals("pf")){
            System.out.printf("O valor de total locação é: R$ %.2f",(diasAluguel>5)?
                    diasAluguel*veiculo.getDiaria()*0.95: diasAluguel* veiculo.getDiaria());
        }else{
            System.out.printf("O valor de total locação é: R$ %.2f",(diasAluguel>3)?
                    diasAluguel* veiculo.getDiaria()*0.9: diasAluguel* veiculo.getDiaria());
        }
    }
}
