public class Municipio {
    private int codigo;
    private String nome;
    private Estado estado; //erdou de da classe estado

    public Municipio(String nome, Estado estado, int codigo) {
        this.nome = nome;
        this.estado = estado;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
