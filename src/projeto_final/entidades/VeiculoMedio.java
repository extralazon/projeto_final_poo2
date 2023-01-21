package projeto_final.entidades;

public class VeiculoMedio extends Veiculo{
    public VeiculoMedio(String nome) {
        super(nome);
        setTipo("medio");
        setDiaria(150);
    }
}
