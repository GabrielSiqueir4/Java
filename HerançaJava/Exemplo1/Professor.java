public class Professor extends SerHumano {  //extendeu da classe ser humano
    private int codigo;
    private String formacao;
    private String curso;
    private int nrHoras;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNrHoras() {
        return nrHoras;
    }

    public void setNrHoras(int nrHoras) {
        this.nrHoras = nrHoras;
    }

}
