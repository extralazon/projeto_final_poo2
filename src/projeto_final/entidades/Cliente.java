package projeto_final.entidades;

public class Cliente {
    private String id;
    private String nome;
    private String tipo;

    public Cliente(String nome){
        this.nome = nome;
        }

    public void setId(String id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}

