package projeto_final.entidades;

public class VeiculoPequeno extends Veiculo{

    public VeiculoPequeno(String nome) {
        super(nome);
        setTipo("pequeno");
        setDiaria(100);
    }
}
