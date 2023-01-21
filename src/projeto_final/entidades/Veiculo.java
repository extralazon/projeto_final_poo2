package projeto_final.entidades;

public abstract class Veiculo {
    private double diaria;
    private String tipo;
    private String nome;

    public Veiculo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getDiaria() {
        return diaria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
