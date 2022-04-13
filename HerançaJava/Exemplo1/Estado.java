public class Estado { //nao extendeu de nada pois é o final da tabela 

    private int codigo;
    private String nome;
    private String sigla;

    public Estado(int codigo, String nome, String sigla) {  //construtor padrao 
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getCodigo() { // get e sets 
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
